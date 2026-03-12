public class UpperBoundOptimisedSolution {
//    Time Complexity O(log n)
    public static void main(String[] args) {
        int[] nums={1,2,3,5,6,7,8,9,9,10,12};
        int target=11;
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){

                low=mid+1;

            }
            else if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
