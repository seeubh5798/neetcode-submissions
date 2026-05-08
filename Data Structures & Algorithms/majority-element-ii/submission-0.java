class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;
        int c1=0;
        int c2=0;

        for(int i=0;i<nums.length;i++){

            if(c1==0 && nums[i] != e2){
                e1 = nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i] != e1){
                e2 = nums[i];
                c2=1;
            }

            else if(nums[i] ==e1){
                c1++;
            }
            else if(nums[i] ==e2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

    
    int ac1=0;
    int ac2=0;

    for(int i=0;i<nums.length;i++){
        if(nums[i] == e1) ac1++;
        if(nums[i] == e2) ac2++;
    }

    List<Integer> ans = new ArrayList<>();

    if(ac1*3 > nums.length) ans.add(e1);
    if(ac2*3 > nums.length) ans.add(e2);
    return ans;
}
}