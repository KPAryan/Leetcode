/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        long x = Long.MIN_VALUE;
        long y = Long.MAX_VALUE;
        return validateBSt(root, x, y);
    }

    private boolean validateBSt(TreeNode r, long min, long max) {
        if (r == null) {
            return true;
        }
        if ((r.val <= min || r.val >= max)) {
            return false;
        }

        boolean x = validateBSt(r.left, min, r.val);
        boolean y = validateBSt(r.right, r.val, max);
        return x && y;
    }
}