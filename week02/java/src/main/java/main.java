import dreamwinter.algorithm019.week02.BinaryTreeDemo;
import dreamwinter.algorithm019.week02.TreeNode;


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

       //二叉树中序遍历测试
       TreeNode node1 = new TreeNode(1);
       TreeNode node2 = new TreeNode(2);
       TreeNode node3 = new TreeNode(9,node1,null);
       TreeNode node4 = new TreeNode(12,node2,node3);
       TreeNode node5 = new TreeNode(5,null,node4);

       BinaryTreeDemo btDemo = new BinaryTreeDemo();
       System.out.println(btDemo.inorderTraversal(node5));
       System.out.println(btDemo.preorderTraversal(node5));



   }
}
