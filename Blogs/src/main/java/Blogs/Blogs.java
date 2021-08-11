package Blogs;

import java.util.Arrays;

public class Blogs {

    public static int[] sort(int[] array){
        if(array.length == 1)return array;

        int midIdx = array.length / 2;
        int[] leftSide = Arrays.copyOfRange(array,0,midIdx);
        int[] rightSide = Arrays.copyOfRange(array,midIdx,array.length);

        return mergeSorted(sort(leftSide),sort(rightSide));
    }
    public static int[] mergeSorted(int[] left, int[] right){
        int[] sortedArray = new int[left.length + right.length];

        int currentlft = 0;
        int currentright = 0;
        int resultIdx = 0;

        while(currentlft < left.length && currentright < right.length){
            if(left[currentlft] <= right[currentright]){
                sortedArray[resultIdx] = left[currentlft];
                currentlft++;

            }else{
                sortedArray[resultIdx] = right[currentright];
                currentright++;
            }
            resultIdx++;
        }
        while(currentlft < left.length){
            sortedArray[resultIdx] = left[currentlft];
            currentlft++;
            resultIdx++;
        }
        while(currentright < right.length){
            sortedArray[resultIdx] = right[currentright];
            currentright++;
            resultIdx++;
        }
        return sortedArray;
    }
    public static void sortArr (int[] arr){
        int n = arr.length;

        for (int i = 0; i <n-1 ; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]< arr[min]){
                    min=j;
                }
            }
            int temp = arr [min];
            arr[min]= arr[i];
            arr[i]= temp;
            System.out.println(temp);
        }}

}
