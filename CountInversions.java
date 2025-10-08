public class CountInversions {
    public static long mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        for (int i = 0; i < left.length; i++) left[i] = arr[l + i];
        for (int j = 0; j < right.length; j++) right[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swaps += (left.length - i);
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
        
        return swaps;
    }

    public static long mergeSortAndCount(int[] arr, int l, int r) {
        long count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    public static long countInversions(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 7, 1, 3, 5};
        System.out.println(countInversions(nums1)); // 5

        int[] nums2 = {-10, -5, 6, 11, 15, 17};
        System.out.println(countInversions(nums2)); // 0

        int[] nums3 = {9, 5, 4, 2};
        System.out.println(countInversions(nums3)); // 6
    }
}
