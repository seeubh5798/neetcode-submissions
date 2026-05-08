class Solution {
    public void sortColors(int[] nums) {
        int l=-1;
        int m =0;
        int h = nums.length-1;

        while(m<=h){
            if(nums[m] ==0){
                l++;
                int temp = nums[m];
                nums[m]= nums[l];
                nums[l] = temp;
                m++;
            }
            else if(nums[m] ==1){
                m++;
            }
            else if(nums[m] == 2){
                int temp = nums[m];
                nums[m]= nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }
}