// 448. Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        boolean flag = false;
        for(int i=1;i<nums.length+1;i++)
        {
            flag = false;
            for(int j=0;j<nums.length;j++)
            {
                if(i == nums[j])
                {
                    flag = true;
                    //break;
                }
            }
            if(flag == false)
            {
                list1.add(i);
            }
        }
        return list1;
    }
}

// this code is not acceptable because time limit exceeded
