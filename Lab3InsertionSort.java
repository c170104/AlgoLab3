class Lab3InsertionSort {
    public static void insertionSort(int list[], int start, int end) {
        int temp;
        int list_size = end - start + 1;

        for(int i=1; i<list_size; i++)  {
            for(int j=(i+start); j>start; j--)  {
                if(list[j] < list[j-1]) {
                    // swap
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
                else
                    break;
            }
        }
    }
}