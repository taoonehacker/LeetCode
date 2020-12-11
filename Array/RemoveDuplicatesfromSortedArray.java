

public class RemoveDuplicatesfromSortedArray {

    public  static void main(String[] args){
        var nums = new int[]{1,1,2};
        var length = removeDuplicates(nums);
        System.out.println(length);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums==null)
            return 0;
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
