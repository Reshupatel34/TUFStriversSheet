public class CountOccurences {
//    Time Complexity O(2*log n )
    public static void main(String[] args) {
        int[] nums={1, 1, 2, 2, 2, 2, 2, 3};
        int target=2;

        int low=0;
        int high=nums.length-1;

        int lastOcc=-1;
        int firstOcc=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                lastOcc=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;

            }
            else if(nums[mid]<target){
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                firstOcc=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
        }
        System.out.println(lastOcc-firstOcc+1);
    }
}
