package dreamwinter.algorithm019.week02;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class SlidingWindow {
    /* 滑动窗口的位置                最大值
---------------               -----
 [       1]  3  -1 -3  5  3  6  7       3
    [    1   3] -1 -3  5  3  6  7       3
        [1  3  -1] -3  5  3  6  7       3
         1 [3  -1  -3] 5  3  6  7       3
         1  3 [-1  -3  5] 3  6  7       5
         1  3  -1 [-3  5  3] 6  7       5
         1  3  -1  -3 [5  3  6] 7       6
         1  3  -1  -3  5 [3  6  7]      7

*/
    public int[] maxSlidingWindow(int[] nums, int k) {
       /*解体思路
       1、构建返回数组 n-k+1
       2、构建大数堆
       3、构建窗口开始和结束索引和k的函数关系
       4、依次循环滑动，并取得最大值
       * */
        if(nums==null || nums.length==0) return new int[0];
        int len = nums.length;
        int[] res = new int[len-k+1]; //返回的数据集合
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int startIndex=0;
        for (int i=0;i<len;i++) {
            startIndex = i - k;
            if (startIndex >= 0) {
                queue.remove(nums[startIndex]);
            }
            queue.offer(nums[i]);
            //说明当前堆已经填充满了
            if(queue.size()==k){
                res[i-k+1]=queue.peek();
            }
        }
        return res;

    }
}
