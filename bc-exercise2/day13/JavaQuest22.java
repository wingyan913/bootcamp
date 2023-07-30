/*
 * 
 * Question : Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * 
 * Constraints : 1 <= n <= 10^5
 * 
 * Example :
 * 
 * Input: n = 4568 Output: 937 Explanation: Product of digits = 4 * 5 * 6 * 8 = 960 Sum of digits = 4 + 5 + 6 + 8 = 23 Result = 960 - 23 = 937
 */

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
    System.out.println(findDifferent(11111));// output : -4
  }

  public static int findDifferent(int n) {
    // code here
    int[] nums = new int[String.valueOf(n).length()]; // nums[0,1,2]
    int product = 1;
    int sum = 0;
    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      nums[i] = String.valueOf(n).charAt(i) - '0';
      if (n > 0) {
        product *= nums[i];
        sum += nums[i];
        result = product - sum;
      }
    }
    return result;
  }
}
