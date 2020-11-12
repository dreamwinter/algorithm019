package dreamwinter.algorithm019.week02;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author libingc
 * @date 2020/11/12
 */
//n叉树练习题
public class nAryTreeDemo {
    //n叉树前序遍历
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        preorderCore(root,res);
        return res;
    }

    private void preorderCore(Node curr,List<Integer> res){
        if (curr==null) return;
        res.add(curr.val);
        for (Node item:curr.children) {
            preorderCore(item,res);
        }

    }

    //后续遍历
    public List<Integer> postorder(Node root) {
       ArrayList<Integer> res = new ArrayList<Integer>();
       postorderCore(root,res);
       return res;
    }

    private void postorderCore(Node curr,List<Integer> res){
        if (curr==null) return;
        for (Node item:curr.children) {
            postorderCore(item,res);
        }
        res.add(curr.val);
    }


    //给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
    //广度优先算法适合使用队列求解
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);
        while (!que.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int len = que.size();
            for (int i = 0; i < len; i++) {
                Node node = que.poll();
                if (node != null) {
                    level.add(node.val);
                    que.addAll(node.children);
                }
            }
            res.add(level);
        }
        return res;
    }


}
