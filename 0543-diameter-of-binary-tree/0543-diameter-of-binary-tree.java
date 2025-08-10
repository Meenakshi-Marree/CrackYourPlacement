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
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxHeight(root);
        return diameter;
    }
    private int maxHeight(TreeNode root){
        if(root == null) return 0;
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);

        diameter = Math.max(diameter,lh+rh);

        return 1+Math.max(lh,rh);
    }
}