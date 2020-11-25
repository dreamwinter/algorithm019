import java.util.*;

/**
 * @author libingc
 * @date 2020/11/25
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal/#/description">二叉树的层序遍历</a>
 */


public class levelOrderTraversal {
    //ex:[3,9,20,null,null,15,7]
    public List<List<Integer>> levelOrder(TreeNode root) { //BFS解法
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //终结者
        if(root==null) {return res;}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //先加入根节点
        queue.offer(root);
        //按层级入队并弹出
        while (!queue.isEmpty()) {
           List<Integer> levelNodes = new ArrayList<Integer>();
           int border = queue.size();  //很重要，否则循环时队列长队会因为出队和入队发生变化
            for (int i = 0; i < border; i++) {
                TreeNode currNode = queue.poll(); //出队
                levelNodes.add(currNode.val);
                if(currNode.left!=null){
                    queue.offer(currNode.left);
                }
                if(currNode.right!=null){
                    queue.offer(currNode.right);
                }
            }

           res.add(levelNodes);
        }
        return res;
    }


}
