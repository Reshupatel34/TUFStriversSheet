public class SearchInsertPosition {
//    Time Complexity O(logN)
    public static void main(String[] args) {
        int[] nums={1,2,4,7};
        int low=0;
        int high=nums.length-1;
        int target=6;
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
        System.out.println("Found at"+ans);
    }
}
