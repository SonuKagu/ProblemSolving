import java.util.Arrays;
import java.util.List;
/* You are given an array nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number, but it can appear more than once.*/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(Arrays.asList(3,2,1,4,3)));
        System.out.println(findDuplicate(Arrays.asList(4,2,1,4,3)));
    }
    public static int findDuplicate(List<Integer> nums) {
        //using bitwise operator xor
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i < nums.size(); i++) {
            xor1 ^= i;
        }
        for (int n : nums) {
            xor2 ^= n;
        }
        return xor1 ^ xor2;
    }
    //time complexity - O(n)
    //space complexity - O(1)
}
