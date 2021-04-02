package org.paradox;


public class RangeSumOfBst {
    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if(root.right != null) {
            rangeSumBST(root.right, low, high);
        }
        if(root.left != null) {
            rangeSumBST(root.left, low, high);
        }
        return sum;
    }
}
