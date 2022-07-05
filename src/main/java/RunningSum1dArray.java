import java.util.Arrays;

public class RunningSum1dArray {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4};
    int[] nums2 = {1, 1, 1, 1, 1};
    int[] nums3 = {3, 1, 2, 10, 1};
    Arrays.stream(runningSum(nums1)).forEach(r -> System.out.print(r + " "));
    System.out.println();
    Arrays.stream(runningSum(nums2)).forEach(r -> System.out.print(r + " "));
    System.out.println();
    Arrays.stream(runningSum(nums3)).forEach(r -> System.out.print(r + " "));
  }

  public static int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = i == 0
          ? nums[i]
          : result[i - 1] + nums[i];
    }
    return result;
  }
}
