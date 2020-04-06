import java.util.ArrayList;
import java.util.TreeSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (var num:nums1){
            treeSet.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(var num:nums2){
            if(treeSet.contains(num)){
                list.add(num);
                treeSet.remove(num);
            }
        }

        int[] res = new int[list.size()];
        for(var i=0;i<list.size();i++){
            res[i] = list.get(i);
        }

        return res;

    }
}
