public class FloorAndCeilInSortedArray {
//    Time Complexity O(n)
    public static void main(String[] args) {
        int[] nums={3,4,4,7,8,10};
        int low=0;
        int high=nums.length-1;
        int target=8;
//        int ans=-1;
        int floor=-1;
        int ceil=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ceil=nums[mid];
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
            if(nums[mid]<=target){
                floor=nums[mid];
                low=mid+1;

            }
            else if(nums[mid]>target){
                high=mid-1;
            }
        }
        System.out.println(floor+","+ceil);
    }
}
