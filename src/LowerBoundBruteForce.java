public class LowerBoundBruteForce {
//    Time Complexity O(n) using LinearSearch
    public static void main(String[] args) {
        int[] nums={3,5,8,15,19};
        int target=9;
       for(int i=0;i<nums.length;i++){
           if(nums[i]>=target){
               System.out.println("Found at index : "+i);
               break;
           }
       }

    }
}
