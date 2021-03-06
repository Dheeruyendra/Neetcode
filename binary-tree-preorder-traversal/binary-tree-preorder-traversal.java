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
        
         List<Integer> ans = new ArrayList<>();
        
         if(root == null)return ans;
        
        
        
         Stack<TreeNode> temp = new Stack<>();
         temp.push(root);
        
          while(!temp.isEmpty()){
              
              TreeNode t = temp.pop();
              ans.add(t.val);
              
              if(t.right != null)temp.push(t.right);
              if(t.left != null)temp.push(t.left);
              
          }
        
        return ans;
        
    }
}