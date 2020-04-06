import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        for(int num:nums){
            if(!treeMap.containsKey(num)){
                treeMap.put(num,1);
            }
            else{
                treeMap.put(num,treeMap.get(num)+1);
            }
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->treeMap.get(a)-treeMap.get(b));
        for (var key:treeMap.keySet()){
            if(priorityQueue.size()<k){
                priorityQueue.add(key);
            }
            else if(treeMap.get(key)>treeMap.get(priorityQueue.peek())){
                priorityQueue.remove();
                priorityQueue.add(key);
            }
        }

        List<Integer> list = new LinkedList<>();
        while (!priorityQueue.isEmpty()){
            list.add(priorityQueue.remove());
        }
        return list;
    }
}
