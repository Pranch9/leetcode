public class FindPivotIndex {
  public static void main(String[] args) {
    int[] nums1 = {1, 7, 3, 6, 5, 6};
    int[] nums2 = {1, 2, 3};
    int[] nums3 = {2, 1, -1};
    System.out.println(pivotIndex(nums1));
    System.out.println(pivotIndex(nums2));
    System.out.println(pivotIndex(nums3));
  }

  public static int pivotIndex(int[] nums) {
    int sum = 0;
    for (int value : nums) {
      sum += value;
    }
    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      sum -= nums[i];
      if (sum == start) {
        return i;
      }
      start += nums[i];
    }
    return -1;
  }
}
