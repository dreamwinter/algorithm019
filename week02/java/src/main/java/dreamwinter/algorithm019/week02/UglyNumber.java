package dreamwinter.algorithm019.week02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author libingc
 * @date 2020/11/13
 */
//我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数
public class UglyNumber {
    /*从第一个丑数1开始去乘以2,3,5，得到一批丑数。在这里选一个最小的数字作为下一个丑数，然后再用它去乘以2,3,5，得到一批新的候选丑数，这样不断操作下去，直到找到第n个丑数。
    * */
    private int[] uglyNumber = {2,3,5};
    public int nthUglyNumber(int n) {
        HashSet<Integer> quickList = new HashSet<>(32);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        quickList.add(1);
        heap.offer(1);
        int counter=0;
        while (counter<n){
            int seed = heap.poll();   //从最小堆弹出最小的元素来计算
            if(++counter>=n){
                return seed;
            }
            for (int val:uglyNumber) {
                int tempValue = val*seed;
                if(!quickList.contains(tempValue)) {
                    quickList.add(tempValue);
                    heap.offer(tempValue);
                }
            }
        }
        return -1;

    }

}
