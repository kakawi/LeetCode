package com.leetcode.linkedlist.medium;

import java.util.HashMap;
import java.util.Map;

import com.common.DoublyNode;

class Pair {
  public int key;
  public int value;

  public Pair(int key, int value) {
    this.key = key;
    this.value = value;
  }
}

public class LRUCache_146_Impl implements LRUCache_146 {
  private final Map<Integer, DoublyNode<Pair>> map = new HashMap<>();
  private final int capacity;
  private final DoublyNode<Pair> head = new DoublyNode<>(new Pair(0, 0));
  private final DoublyNode<Pair> tail = new DoublyNode<>(new Pair(0, 0));

  public LRUCache_146_Impl(int capacity) {
    this.capacity = capacity;
    head.next = tail;
    tail.prev = head;
  }

  private void insert(DoublyNode<Pair> newNode) {
    var prev = tail.prev;
    prev.next = newNode;
    newNode.next = tail;
    newNode.prev = prev;
    tail.prev = newNode;
  }

  private void remove(DoublyNode<Pair> node) {
    var next = node.next;
    var prev = node.prev;
    next.prev = prev;
    prev.next = next;
  }

  public int get(int key) {
    if (map.containsKey(key)) {
      var node = map.get(key);
      remove(node);
      insert(node);
      return node.value.value;
    }
    return -1;
  }

  public void put(int key, int value) {
    if (map.containsKey(key)) {
      remove(map.get(key));
    }
    var newNode = new DoublyNode<>(new Pair(key, value));
    insert(newNode);
    map.put(key, newNode);
    if (map.size() > capacity) {
      var tmp = head.next;
      remove(tmp);
      map.remove(tmp.value.key);
    }
  }
}
