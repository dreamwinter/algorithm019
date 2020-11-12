package dreamwinter.algorithm019.week02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class BinaryTreeDemo {
    //二叉树中序遍历-递归
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        inorderTraversalCore(root, numbers);
        return numbers;
    }

    private void inorderTraversalCore(TreeNode currNode,List<Integer> numbers){
        //边界检查
        if (currNode==null) return;
        inorderTraversalCore(currNode.left,numbers);
        numbers.add(currNode.val);
        inorderTraversalCore(currNode.right,numbers);
    }

    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      this.preorderTraversalCore(root,numbers);
      return numbers;
    }

    private void preorderTraversalCore(TreeNode curr,List<Integer> numbers){
        if(curr==null) return;
        numbers.add(curr.val);
        preorderTraversalCore(curr.left,numbers);
        preorderTraversalCore(curr.right,numbers);
    }

}
