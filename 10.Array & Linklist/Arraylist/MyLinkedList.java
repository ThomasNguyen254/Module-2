package Arraylist;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(Object data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (currentNode == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numNodes++;
    }

//    public void add(int index, E element) {
//        Node newNode = new Node(element);
//        if (index == 0) {
//            newNode.next = head;
//            head = newNode;
//            numNodes++;
//            return;
//        }
//        Node currentNode = head;
//        for (int i = 0; i < index - 1; i++) {
//            currentNode = currentNode.next;
//        }
//        newNode.next = currentNode.next;
//        currentNode.next = newNode;
//        numNodes++;
//    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        add(data);
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            numNodes--;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        numNodes--;
    }

    public void remove(Object o) {
        if (head == null) {
            return;
        }
        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return;
        }
        Node currentNode = head;
        while (currentNode != null && !currentNode.next.data.equals(o)) {
            currentNode = currentNode.next;
        }
        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            numNodes--;
        }
    }

    public Object get(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList(head.data);
        Node currentNode = head.next;
        while (currentNode != null) {
            newList.add(currentNode.data);
            currentNode = currentNode.next;
        }
        return newList;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(o)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }
}

