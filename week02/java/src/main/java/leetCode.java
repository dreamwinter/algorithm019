import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author libingc
 * @date 2020/11/10
 */
public class leetCode {

    /*
    解体思路：
    1、遍历strs字符数组，生成item
    2、对每一个item通过toCharArray，依次对预先构建的26个字母数据进行索引查找（aASCII表是56，则进行相对位置计算并在此栏位+1）
    3、理论上，如果一个字符串是字母异位词，则最终的26个数组应该一致
    4、将数组转换成字符串到hashmap中匹配，如果找到，就说明是字母异位词
    * */
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs==null || strs.length==0) return new ArrayList<List<String>>();

        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String item:strs
             ) {
            char[] letters = new char[26];
            for (char ch : item.toCharArray())
                letters[ch - 'a']++;

            String key = String.valueOf(letters);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(item);

        }
        return new ArrayList<List<String>>(map.values());

    }


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    //二叉树中序遍历

}
