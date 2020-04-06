import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        //数字与出现频次之间的映射
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (var num : nums1) {
            if (!treeMap.containsKey(num)) {
                treeMap.put(num, 1);
            } else
                treeMap.put(num, treeMap.get(num) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (var num : nums2) {
            if (treeMap.containsKey(num)) {
                list.add(num);
                treeMap.put(num, treeMap.get(num) - 1);
                if (treeMap.get(num) == 0) {
                    treeMap.remove(num);
                }
            }
        }

        var res = new int[list.size()];
        for (var i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }


    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        var length1 = nums1.length;
        var length2 = nums2.length;

        ArrayList<Integer> list = new ArrayList<>();

        int i, j = 0;
        while (i < length1 && j < length2) {
            var a = nums1[i];
            var b = nums2[i];

            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a > b) {
                j++;
            } else {
                i++;
            }
        }

        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            res[k] = list.get(k);
        }

        return res;

    }


}
