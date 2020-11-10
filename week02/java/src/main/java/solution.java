import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author libingc
 * @date 2020/11/10
 */
class Solution {
    /*
    解法1：暴力求解，分别遍历s，t的每个字母创建hashmap，如果找到就加一。最后先比较两个字典的长度，若长度不同则返回false
    若长度相同，再相互遍历
    解法2：先排序，然后批量字符串
    解法3：使用一个hashmap，在另外一个字符串中逐个字符匹配，遇到到减一，最后看这个map是不是空或长度为0
    * */
    public boolean isAnagram(String s, String t) {
        //解法2的实现
        if(s.length()!=t.length()) return false;
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1,char2);
    }


}