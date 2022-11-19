package Array;


// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Example 1: 
// Input:nums = [1, 2, 3, 1]
// Output:   true 
// Example 2: 
// Input:nums = [1, 2, 3, 4]
// Output:   false 
// Example 3:
// Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output:   true 
// Constraints:
//  • 1 <= nums .  lengtth <= 10^5
// • -10^9 <= nums [ i ] <= 10^9 

public class repeatingLetters {
    public static void main(String[] args) {
        int nums[] = {};

        boolean isRepeating = checkRepeat(nums);
        
        System.out.println(isRepeating);
    }

    static boolean checkRepeat(int nums[]){

        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
