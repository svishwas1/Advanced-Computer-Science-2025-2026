

public class MergeSort {

    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int merge = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < arr1.length && index2 < arr2.length) {
            if (arr1[index1] < arr2[index2]) {
                mergedArr[merge] = arr1[index1];
                index1++;
                merge++;
            } else  {
                mergedArr[merge] = arr2[index2];
                index2++;
                merge++;
            }
        }
        if (arr1.length < arr2.length) {
            for (int i = index2; i < arr2.length; i++) {
                mergedArr[merge] = arr2[i];
                merge++;
            }
        } else if (arr2.length < arr1.length) {
            for (int i = index1; i < arr1.length; i++) {
                mergedArr[merge] = arr1[i];
                merge++;
            }
        }
        return mergedArr;

    }

    public static void display(int[] arr1, int[] arr2) {
        int[] arr = mergeSort(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 5, 7, 9, 11};
        int[] arr2 = new int[] {2, 4, 6, 7};
        display(arr1, arr2);
    }
}