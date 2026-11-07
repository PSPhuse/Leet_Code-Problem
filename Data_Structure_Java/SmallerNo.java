// Q.How Many Numbers Are Smaller Than the Current Number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int num[] = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
            }
            num[i] = count;
        }
        return num;
    }
}
