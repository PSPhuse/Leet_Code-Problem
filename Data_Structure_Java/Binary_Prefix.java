// 1018. Binary Prefix Divisible By 5
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        
        List<Boolean> list1 = new ArrayList<>();

        int currem = 0;
        for(int num:nums)
        {
            currem = (currem * 2 + num) % 5;

            list1.add(currem == 0);
        }
        return list1;
    }
}
