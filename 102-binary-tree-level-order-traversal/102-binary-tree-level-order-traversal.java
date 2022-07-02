/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //level order is level wise children
    public void lvlO(TreeNode t, int level, List<List<Integer>> l){
        if( t != null ){
            if(l.size() <= level ){
                l.add(new ArrayList<Integer>());
            }
            l.get(level).add(t.val);
            lvlO(t.left, level+1, l);
            lvlO(t.right, level+1, l);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        lvlO(root, 0, res);
        return res;
    }
}