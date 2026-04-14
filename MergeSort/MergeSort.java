

public class MergeSort {

    public static int[] mergeSort(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < mergedArr.length; i++) {
            if (arr1[index1] < arr2[index2]) {
                mergedArr[i] = arr1[index1];
                if (index1 < arr1.length - 1) {
                    index1++;
                } else {
                    for (int j = index1; i < mergedArr.length; j++) {
                        
                    }
                }
            } else if (arr1[index1] > arr2 [index2]) {
                mergedArr[i] = arr2[index2];
                if (index2 < arr2.length - 1) {
                    index2++; 
                } else {
                    break;
                }
            }
            /* } else if (arr1[index1] == arr2 [index2]) {
                mergedArr[i] = arr1[index1];
                index1++;
                mergedArr[i + 1] = arr2[index2];
                index2++;
                i++;
            }
                */
        }
        
        if (arr1.length < arr2.length) {
            for (int j = arr1.length; j < arr2.length; j++) {
                mergedArr[j] = arr2[j];
            }
        } else {
            for (int j = arr1.length; j < arr2.length; j++) {
                mergedArr[j] = arr2[j];
            }

        }
        return mergedArr;

    }

    public static void display() {
        //int[] arr1 = new int[] {0, 4, 8, 9, 11, 12};
        //int[] arr2 = new int[] {3, 5, 6, 10, 11, 13, 15};
        int[] arr1 = new int[] {1, 1};
        int[] arr2 = new int[] {2, 3};

        int[] arr = mergeSort(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1};
        int[] arr2 = new int[] {2, 3};
        mergeSort(arr1, arr2);
        display();
    }
}