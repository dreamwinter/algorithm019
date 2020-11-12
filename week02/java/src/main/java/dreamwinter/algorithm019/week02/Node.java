package dreamwinter.algorithm019.week02;

import java.util.List;

/**
 * @author libingc
 * @date 2020/11/12
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node(int val){
        this.val = val;
    }

    public Node(int val,List<Node> children){
        this.val = val;
        this.children = children;
    }
}
