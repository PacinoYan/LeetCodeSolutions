public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //O(n), 不需要额外的空间
        if(m + n > 0) {
            int p = m-- + n-- -1;
            while (m >= 0 && n >= 0) {
                if(nums1[m] > nums2[n])
                    nums1[p--] = nums1[m--];
                else if(nums1[m] <= nums2[n]) {
                    nums1[p--] = nums2[n--];
                }
            }

            while (n >= 0) {
                nums1[p--] = nums2[n--];
            }
        }
    }
}
