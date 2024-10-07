package az.edu.turing.mergeSortedArrays;


public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {5, 7, 8};
        mergeSortedArrays(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
    }
}
