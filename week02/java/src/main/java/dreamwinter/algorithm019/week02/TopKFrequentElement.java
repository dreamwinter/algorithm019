package dreamwinter.algorithm019.week02;

import java.util.*;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class TopKFrequentElement {
    //给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
    //输入: nums = [1,1,1,2,2,3], k = 2
    //输出: [1,2]
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //构建快速字典
        for (int key:nums) {
            map.put(key, map.getOrDefault(key,0)+1);
        }

        //构建大顶堆
        PriorityQueue<Map.Entry<Integer,Integer>> maxQue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
               return o2.getValue()-o1.getValue();
            }
        });

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
               maxQue.offer(entry);
        }

        int[] res = new int[k];
        for (int i=0;i<k;i++){
            res[i] = maxQue.poll().getKey();
        }

       return  res;
    }
}
