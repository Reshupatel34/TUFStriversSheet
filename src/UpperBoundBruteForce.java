public class UpperBoundBruteForce {
    public static void main(String[] args) {
        int[] nums={3,5,8,9,15,19};
        int target=9;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target){
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(nums.length);
        }
    }
}
