/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
     private class ResultType {
        int path = 0;
        int sum = Integer.MIN_VALUE;
    }

    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType();
        }
        // Divide
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        // Conquer
        ResultType data = new ResultType();
        data.path = Math.max(0, Math.max(left.path, right.path)+root.val);
        data.sum = Math.max(Math.max(left.sum, right.sum), left.path+right.path+root.val);
        return data;
    }

    public int maxPathSum(TreeNode root) {
        ResultType result = helper(root);
        return result.sum;
    }
}