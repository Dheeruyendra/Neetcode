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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
        Stack<TreeNode> temp = new Stack<>();
        
        TreeNode curr = root;
        
        while(true){
            
            if(curr != null){
                temp.add(curr);
                curr = curr.left;
            }else{
                
                if(temp.isEmpty())break;
                TreeNode t = temp.pop();
                ans.add(t.val);
                
                curr = t.right;
                
                
            } 
            
        }
        
        return ans;
        
    }
}