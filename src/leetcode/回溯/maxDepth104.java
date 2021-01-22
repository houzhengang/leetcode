package leetcode.回溯;

public class maxDepth104 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int maxDepth(TreeNode root) {
        int max = 0;
        max = length(root,max);
        return max;

    }
    public int length(TreeNode root,int max){
        if(root==null)
        {
            return max+1;
        }else{
            max = Math.max(length(root.left,max)+1,length(root.right,max)+1);
            return max;
        }
    }

}
