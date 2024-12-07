package com.common;

public class DoublyNode<T> {
  public T value;
  public DoublyNode<T> prev;
  public DoublyNode<T> next;

  public DoublyNode(T value) {
    this.value = value;
  }
}
