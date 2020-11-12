package dreamwinter.algorithm019.week02;

import java.util.PriorityQueue;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class BinaryHeapTraining {

    //获取最小的k个数
    public int[] getLeastNumbers(int[] arr, int k) {
       /*利用BinaryHeap进行查找，时间复杂度O(Nlogk)
       若利用sort，时间复杂度为O(NlogN)
       * */
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); //最小堆
        for (int val:arr) {
            queue.add(val);
        }

        int[] res = new int[k];
        for (int i=0;i<=k;i++){
            res[i] = queue.poll();
        }
        return res;
    }
}


