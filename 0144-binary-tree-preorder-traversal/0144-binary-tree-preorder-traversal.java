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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;
    }
    void preorder(TreeNode root,List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            list.add(root.val);
            preorder(root.left,list);
            //list.add(root.val);
            preorder(root.right,list);
        } 
    }
}