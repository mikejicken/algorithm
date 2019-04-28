import javax.swing.tree.TreeNode;

public class LeetCode_671_41 {
    public int min = Integer.MAX_VALUE;
    public int seMin = min;
    public int findSecondMinimumValue(TreeNode root) {
        Traverse(root);
        if(min == seMin || seMin + 1 < 0) return -1;
        else return seMin;
    }
    public void Traverse(TreeNode root) {
        if(root == null) return;
        if(root.val < min){
            min = root.val;
        }else if(root.val < seMin && root.val > min){
            seMin = root.val;
        }
        Traverse(root.left);
        Traverse(root.right);
    }
}
