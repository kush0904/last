public class TrainsIntervalScheduling {

    public static void TrainScheduling(int n, int[] arrivalTime, int[] departureTime){
        int i,j, counter = 1;

        i = 0; // Set i to 0 as the first train is always selected

        System.out.print(i);

        for(j = 1; j < n; j++){
            if(arrivalTime[j] >= departureTime[i]){
                System.out.print(" " + j);
                i = j;
                ++counter;
            }
        }

        System.out.println("\nNumber of trains stopping at the station: " + counter);
    }


    public static void main(String[] args) {
        int n  = 6;

        int[] arrivalTime = {900, 940, 950, 1100, 1500, 1800};
        int[] departureTime = {910, 1200, 1120, 1130, 1900, 2000};

        TrainScheduling(n, arrivalTime, departureTime);
    }
}
