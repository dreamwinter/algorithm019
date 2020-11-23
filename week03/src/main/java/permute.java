import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author libingc
 * @date 2020/11/23
 */
//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
public class permute {
    public List<List<Integer>> Solution(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        premuteCore(n, output, res, 0);
        return res;
    }

    //回溯算法
    public void premuteCore(int n, List<Integer> output, List<List<Integer>> answ, int first) {
        // 所有数都填完了
        if (first == n) {
            answ.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            premuteCore(n, output, answ, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }
}
