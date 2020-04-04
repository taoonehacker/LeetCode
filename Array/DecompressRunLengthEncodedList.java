import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public static void main(String[] args) {

    }

    public int[] decompressRLElist(int[] nums) {
        var list = new ArrayList<Integer>();

        for (var i = 0; i < nums.length; i += 2) {
            var freq = nums[i];
            var val = nums[i + 1];
            while (freq != 0) {
                list.add(val);
                freq--;
            }
        }
        var result = new int[list.size()];
        for (var i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
