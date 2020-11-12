package dreamwinter.algorithm019.week02;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){};
    public TreeNode(int val){this.val = val;}
    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
