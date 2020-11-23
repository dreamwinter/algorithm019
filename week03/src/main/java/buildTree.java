/**
 * @author libingc
 * @date 2020/11/23
 */
//从前序和中序序列构建二叉树
public class buildTree {

    public TreeNode Solution(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,  inorder, (long)Integer.MAX_VALUE + 1);
    }

    int pre = 0;
    int in = 0;
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
        //terminator
        if(pre == preorder.length){
            return null;
        }

        if (inorder[in] == stop) {
            in++;
            return null;
        }
        //process
        int root_val = preorder[pre++];
        TreeNode root = new TreeNode(root_val);
        //drill down
        root.left = buildTreeHelper(preorder,  inorder, root_val);
        root.right = buildTreeHelper(preorder, inorder, stop);
        return root;
    }

}
