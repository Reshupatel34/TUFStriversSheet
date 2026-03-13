public class FirstAndLastOccurence {
//    Time Complexity O(log n)
public static void main(String[] args) {
//       int n=7;
       int target=60;
       int[] nums={3,4,13,13,13,20,40};
       int low=0;
       int high=nums.length-1;
       int last=-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(nums[mid]==target){
               last=mid;
               low=mid+1;

           }
           else if(nums[mid]<target){
               low=mid+1;
           }
           else if(nums[mid]>target){
               high=mid-1;
           }
       }
    System.out.println(last);
}
}
