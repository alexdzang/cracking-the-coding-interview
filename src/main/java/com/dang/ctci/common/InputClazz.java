package com.dang.ctci.common;

public class InputClazz {

  public static <T> Node<T> createLinkedListNode(T[] arr) {
    Node<T> head = new Node<T>(arr[0]);
    Node<T> temp = head;
    if (arr.length > 1) {
      for (int i = 1; i < arr.length; i++) {
        Node<T> newNode = new Node<T>(arr[i]);
        temp.next = newNode;
        temp = newNode;
      }
    }
    return head;
  }
  
  public static <T> Node<T> createCycleLinkedList(T[] arr) {
    Node<T> head = new Node<T>(arr[0]);
    Node<T> temp = head;
    if (arr.length > 1) {
      for (int i = 1; i < arr.length; i++) {
        Node<T> newNode = new Node<T>(arr[i]);
        temp.next = newNode;
        temp = newNode;
        if (i == arr.length - 1) temp.next = head;
      }
    }
    return head;
  }

  public static <T> TreeNode<T> createBinaryTree(T[] arr) {
    return createBinaryTree(arr, 0, arr.length - 1);
  }

  private static <T> TreeNode<T> createBinaryTree(T[] arr, int start, int end) {
    if (end < start)
      return null;
    int mid = (start + end) / 2;
    TreeNode<T> node = new TreeNode<T>(arr[mid]);
    node.left = createBinaryTree(arr, start, mid - 1);
    node.right = createBinaryTree(arr, mid + 1, end);
    return node;
  }

}
