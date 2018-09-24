class Lab3MergeSort {
    private static void merge(int[] list, int start, int end, int mid)  {
        int left_size = mid - start + 1;
        int right_size = end - mid;

        int temp_arr_l[] = new int[left_size];
        int temp_arr_r[] = new int[right_size];

        int i, j, k;

        for(i=0; i<left_size; i++)
            temp_arr_l[i] = list[i+ start];
        for(j=0; j<right_size; j++)
            temp_arr_r[j] = list[j + mid + 1];

        i = 0;
        j = 0;
        k = start;
        while(i < left_size && j < right_size)    {
            if(temp_arr_l[i] < temp_arr_r[j])   {
                // a < b
                list[k] = temp_arr_l[i];
                i++;
            } else {
                // a >= b
                list[k] = temp_arr_r[j];
                j++;
            }
            k++;
        }
        
        // append list with remaining items
        while(i < left_size)    {
            list[k] = temp_arr_l[i];
            i++;
            k++;
        }

        while(j < right_size)   {
            list[k] = temp_arr_r[j];
            j++;
            k++;
        }
    } 

    public static void mergeSort(int[] list, int start, int end)  {
        int mid = (start + end) / 2;
        
        if(end - start == 0)
            return;

        else if(end - start > 1)  {
            mergeSort(list, start, mid);
            mergeSort(list, mid+1, end);
        }
        merge(list, start, end, mid);
    }

    public static void specialMergeSort(int[] list, int start, int end, int S)  {
        int mid = (start + end) / 2;
        if(end - start > S) {
            specialMergeSort(list, start, mid, S);
            specialMergeSort(list, mid+1, end, S);
            merge(list, start, end, mid);
        } else {
            Lab3InsertionSort.insertionSort(list, start, end);
        }        
    }
}