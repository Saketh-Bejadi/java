import java.util.Arrays;

public class RotateArrayOne {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int temp=nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i] =nums[i+1];
        }
        nums[nums.length-1] = temp;
        System.out.println(Arrays.toString(nums));
    }
}
