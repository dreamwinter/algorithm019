import java.io.Console;

/**
 * @author libingc
 * @date 2020/11/10
 * 242. 有效的字母异位词
 */
public class main {

   public static void main(String[] args){
       String s = "anagram";
       String t = "nagaram";
       Solution tester = new Solution();
       System.out.println(
              tester.isAnagram(s,t));
    }
}
