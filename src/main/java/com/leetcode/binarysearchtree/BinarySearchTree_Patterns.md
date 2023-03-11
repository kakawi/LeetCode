# BinarySearchTree
### Check if it is valid
- use Stack
```java
Stack<TreeNode> stack = new Stack<>();
while(root != null || !stack.isEmpty()) {
    while(root != null) {
        stack.push(root);
        root = root.left;
    } 
    root = stack.pop();
    // Do something useful
    root = root.right;
}
```

- or Moris Traversal - O(n) time, O(1) space

TODO

TODOx2

Just in case the interviewer asks ;-) Here's an iterative version that works for duplicate values. (Below, duplicate values must be on the left side of a node. If it needs to be on right side, then just switch the > and >= signs.)
```java
class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;
        boolean onRightSideOfPrev = false;
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(prev != null && ((!onRightSideOfPrev && prev.val > root.val) || (onRightSideOfPrev && prev.val >= root.val))) {
              return false;
            }
            prev = root;
            root = root.right;
            onRightSideOfPrev = root == null ? false : true;
        }
        return true;
        }
    }
```

## [](./medium/Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235)
- choose left or right branch
- if you can't decide than current node is LCA
