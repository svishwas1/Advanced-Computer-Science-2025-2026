public class Sort {
    int[] nums;
    Sort() {
        nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
    }
    public void sort1() {
        int n = 0;
        while (n < nums.length) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    int large = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = large;
                }
            }
            n++;
        }
    }

    public void print() {
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.print(nums[i]);
            }
        }
    }
}