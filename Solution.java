class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

// Or Use Recursive method
// return 1 + Math.max(findHeight(root.left), findHeight(root.right))
public class Solution{
private static int level(TreeNode root) {
if(root == null ) return 0;
Queue<TreeNode> queue = new LinkedList<>();
queue.add(root);
int l = 0;
while(!queue.isEmpty()) {
int size = queue.size();

l++;
for(int i=0;i<size;i++) {
TreeNode current = queue.poll();
if(current.left !=null) {
queue.offer(current.left);
}
if(current.right !=null) {
queue.offer(current.right);
}
}
}
return l;
}
}
