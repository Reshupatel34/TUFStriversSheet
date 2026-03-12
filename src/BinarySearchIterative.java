
public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] nums={3,4,5,7,9,12,16,17};
        int target=17;
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                System.out.println("Found at index : "+mid);
                break;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
        }

    }
}
