class Solution {
  static int[] targetSum(int[] a, int target) {
    int left = 0, right = a.length - 1, tempSum;
    while (left < right) {
      tempSum = a[left] + a[right];
      if (tempSum == target)
        return new int[] { left + 1, right + 1 };
      if (tempSum > target)
        right--;
      else
        left++;
    }
    return new int[] { -1, -1 };
  }

  public static void main(String args[]) {
    // int[] a = { 1, 4, 5, 11, 12 };
    // int target = 9;
    int[] a = { -1, -2, -3, -4, -5 };
    int target = -8;
    for (int x : targetSum(a, target))
      System.out.print(x + " ");
  }
}
