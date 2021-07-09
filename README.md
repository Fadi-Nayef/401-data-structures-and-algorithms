# array-binary-search 
## lab 03
![image](https://user-images.githubusercontent.com/80682261/125021752-eeffa100-e083-11eb-9910-0ec12878977e.png)

## CODE
```
public static int BinarySearch(int[] arr, int num) {
 int firstIdx = 0, midIdx, lastIdx = arr.length - 1;
    while (firstIdx  <= lastIdx) {
        midIdx = (lastIdx + firstIdx) / 2;
        if (arr[midIdx] == num) {
            return midIdx;
        } else if (arr[midIdx] > num) {
            firstIdx=midIdx-1;
        }
        else {
           lastIdx=midIdx+1;
        }
    }
    return -1;
}
```
