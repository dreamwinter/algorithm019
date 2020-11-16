import java.util.ArrayList;
import java.util.List;

/**
 * @author libingc
 * @date 2020/11/16
 */
//https://leetcode-cn.com/problems/generate-parentheses/
/*
题解：
假设有2*n个，依次填充左括号，1，2，3...n个
* */
public class generateParentheses {
    ArrayList<String> _res;
    public List<String> generateParenthesis(int n) {
        _res = new ArrayList<String>();
        this.generate(0,0,n,"");
       return _res;
    }

    //最小重复单元的核心就是要么在字符串上加左括号，要么就是右括号
    public void generate(int level,int max,String s){
        //terminator
        if(level>=max) {
            System.out.println(s);
            return;
        };
        ///process

        generate(level+1,max,s+"(");
        generate(level+1,max,s+")");
        //drill down

        //reverse states
    }

    private void generate(int left,int right,int n,String s){
        //terminator
        if(left==n && right==n) {
            _res.add(s);
            //System.out.println(s);
            return;
        };
        ///process& drill down
        if(left<n) {
            generate(left + 1, right, n,s + "(");
        }
        if(left>right && right<n) {
            generate(left, right+1,n, s + ")");
        }
        //reverse states
    }


    public static void main(String[] args){
        generateParentheses proc = new generateParentheses();
        proc.generateParenthesis(6);
    }
}
