import java.io.Console;

/**
 * @author libingc
 * @date 2020/11/10
 * 242. 有效的字母异位词
 */
public class main {

   public static void main(String[] args){
       String[] content = new String[]{
               "eat","tea","tan","ate","nat","bat"};
       System.out.println(
              new leetCode().groupAnagrams(content));
    }
}
