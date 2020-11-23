

/**
 * @author libingc
 * @date 2020/11/23
 */
//二叉树的最近公共祖先

public class lowestCommonAncestor {


    public TreeNode Solution(TreeNode root, TreeNode p, TreeNode q) {
        //terminator
        if(root == null || root == p || root == q) return root;
        //process& drill down
        TreeNode left = Solution(root.left, p, q);
        TreeNode right = Solution(root.right, p, q);
        if(left == null && right == null) return null;
        if(left == null) return right;
        if(right == null) return left;
        return root;
    }

}
