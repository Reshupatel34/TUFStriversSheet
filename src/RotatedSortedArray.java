public class RotatedSortedArray {
//    Time Complexity O(log n)
    public static int helper(int[] nums,int low,int high,int target){

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
//                left sorted part
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>target  ){
                    high=low-1;
                }else{
                    low=mid+1;
                }
            }
//            for right part
            else{
                if(nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,3};
        int target=3;
        int ans=helper(nums,0,nums.length-1,target);
        System.out.println(ans);
    }
}
