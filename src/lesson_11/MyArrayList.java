package lesson_11;

public class MyArrayList<T> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int capacity) {
        data = new Object[capacity];
        size = 0;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("ば、バカ! Индекс вне границ 😡");
        return (T) data[index];
    }

    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) return true;
        }
        return false;
    }

    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                for (int j = i; j < size - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[--size] = null;
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }
}

