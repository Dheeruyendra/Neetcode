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
    public List<Integer> postorderTraversal(TreeNode root) {
           LinkedList<Integer> ans = new LinkedList<>();
           
            Stack<TreeNode> s = new Stack<>();
            
        
            while(!s.isEmpty() || root != null){
                
                if(root != null){
                     s.push(root);
                    ans.addFirst(root.val);
                    root = root.right;
                }else{
                    TreeNode node = s.pop();
                    root = node.left;
                }
                
            }
        
          return ans;
          
    }
}