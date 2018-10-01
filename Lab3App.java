import java.util.Random;

class Lab3App  {
    private static final int RAND_RANGE = 1000;
    private static final int ARR_SIZE = 100;
    private static final int S = 10;

    public static void main(String[] args)  {
        Random rand = new Random();
        int list1[] = new int[ARR_SIZE];
        int list2[] = new int[ARR_SIZE];
        int temp, counter1, counter2;
        long startTime, endTime;

        Lab3SortAlgo sortAlgo = new Lab3SortAlgo();

        for(int i=0; i<ARR_SIZE; i++) {
            temp = rand.nextInt(RAND_RANGE);
            list1[i] = temp;
            list2[i] = temp;
        }

        printList(list1, ARR_SIZE);
        startTime = System.nanoTime();
        sortAlgo.mergeSort(list1, 0, ARR_SIZE-1);  // Normal MergeSort
        endTime = System.nanoTime();
        counter1 = sortAlgo.getNoOfKeyComparison();
        sortAlgo.resetCounter();
        printList(list1, ARR_SIZE);
        System.out.printf("Normal MergeSort Execution time: %d nano seconds\nKey Comparisons: %d\n", endTime-startTime, counter1);
        
        printList(list2, ARR_SIZE);
        startTime = System.nanoTime();
        sortAlgo.specialMergeSort(list2, 0, ARR_SIZE-1, S);    // Modified MergeSort (Combination of MergeSort and InsertionSort)
        endTime = System.nanoTime();
        counter2 = sortAlgo.getNoOfKeyComparison();
        sortAlgo.resetCounter();
        printList(list2, ARR_SIZE);
        System.out.printf("Modified MergeSort Execution time: %d nano seconds\nKey Comparisons: %d\n", endTime-startTime, counter2);
    }

    private static void printList(int list[], int size)   {
        for(int i=0; i<size; i++)   {
            System.out.printf("%d | ", list[i]);
        }
        System.out.println("");
    }
}