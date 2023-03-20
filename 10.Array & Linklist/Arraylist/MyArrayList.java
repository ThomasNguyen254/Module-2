package Arraylist;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException("Invalid capacity: " + capacity);
        }
        elements = new Object[capacity];
    }

    public void add(int index,E element) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        ensureCapacity(size + 1);
        System.arraycopy(element,index,element,index+1,size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if(index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        E oldValue = (E) elements[index];
        int numMoved = size - index - 1;
        if(numMoved > 0 ) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
    }
}
