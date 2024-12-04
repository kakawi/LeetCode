package com.common;

import java.util.LinkedList;
import java.util.Queue;

public class TreeConstructor {
  public TreeNode constructTree(Integer[] array) {
    if (array == null || array.length == 0) {
      return null;
    }
    var root = new TreeNode(array[0]);

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int index = 1; // current position in the array

    // construct the tree level by level
    while (!queue.isEmpty() && index < array.length) {
      TreeNode node = queue.poll();
      // add left node if possible
      if (array[index] != null) {
        var leftNode = new TreeNode(array[index]);
        node.left = leftNode;
        queue.add(leftNode);
      }
      index++;

      // add right node if possible
      if (index < array.length && array[index] != null) {
        var rightNode = new TreeNode(array[index]);
        node.right = rightNode;
        queue.add(rightNode);
      }
      index++;
    }

    return root;
  }
}
