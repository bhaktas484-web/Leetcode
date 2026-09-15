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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //     if(p==null && q == null){
        //     return true;
        //     }
        //    if(p==null || q==null || p.val!=q.val){
        //     return false;
        //     }
        //     return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
           
           return issame(p,q);
    }
    public boolean issame(TreeNode p,TreeNode q){
        if(p==null && q == null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        if(!issame(p.left,q.left)){
            return false;
        }
        if(!issame(p.right,q.right)){
            return false;
        }
        return true;

    }
}