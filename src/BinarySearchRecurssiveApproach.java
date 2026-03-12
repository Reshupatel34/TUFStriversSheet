public class BinarySearchRecurssiveApproach {
//    Time Complexity O(n)
    public static int Recurssive(int nums[],int low,int high,int target){
       if(low>high)return -1;

       int mid=(low+high)/2;
           if(nums[mid]==target){
               return mid;
           }
           else if(nums[mid]>target){
               return Recurssive(nums,low,mid-1,target);
           }

           return Recurssive(nums,mid+1,high,target);

    }
    public static void main(String[] args) {
        int[] nums={3,4,6,7,9,12,16,17};
       int ans= Recurssive(nums,0,nums.length-1,17);
        System.out.println("Found at Index : "+ans);
    }
}
