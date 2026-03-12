public class LowerBoundOptimisedSolution {
//    Time Complexity O(log n)
    public static void main(String[] args) {
//        int[] nums={3,5,8,15,19};
        int[] nums={1,2,2,3};
        int target=2;
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
              low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
