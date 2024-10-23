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
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> result = new ArrayList<Integer>();
        rightView(root,result,0);
        return result;
        
    }
    public void rightView(TreeNode curr,List<Integer> result,int CurrDepth){
    if(curr == null){
        return;
    }
    if (CurrDepth == result.size()){
        result.add(curr.val);
    }
    rightView(curr.right,result,CurrDepth+1);
    rightView(curr.left,result,CurrDepth+1);
    }
}