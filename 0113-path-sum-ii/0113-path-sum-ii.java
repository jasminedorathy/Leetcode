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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> a = new ArrayList<>();
        path(root,targetSum,new ArrayList<>(),a);
        return a;
    }

        public void path(TreeNode root,int targetSum, List<Integer> curr, List<List<Integer>> a)
        {
            if(root == null) return;
            curr.add(root.val);

            if((root.left == null && root.right == null) && (targetSum == root.val) )
            a.add(new ArrayList<>(curr));

            else
            {
                path(root.left,targetSum - root.val,curr,a);
                 path(root.right,targetSum - root.val,curr,a);
            }
            curr.remove(curr.size()-1);
        }

    }
