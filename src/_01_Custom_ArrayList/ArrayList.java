package _01_Custom_ArrayList;

import java.awt.*;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
    T[] arr;


    public ArrayList() {
        arr = (T[]) new Object[10];
    }

    public ArrayList(int size) {
        arr = (T[]) new Object[size];
    }

    public T get(int loc) throws IndexOutOfBoundsException {
        if (loc > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return arr[loc];
    }

    public void add(T val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = val;
                return;
            }
        }
        T[] arr2 = (T[]) new Object[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr2[arr2.length - 1] = val;

        arr = arr2;

    }

    public void insert(int loc, T val) throws IndexOutOfBoundsException {
        if (loc > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = arr.length - 1; i > loc; i--) {
            arr[i] = arr[i - 1];
        }
        set(loc, val);
    }

    public void set(int loc, T val) throws IndexOutOfBoundsException {
        if (loc > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        arr[loc] = val;
    }

    public void remove(int loc) throws IndexOutOfBoundsException {
        if (loc > arr.length) {
            throw new IndexOutOfBoundsException();
        }
        arr[loc] = null;
        for (int i = loc; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = null;
    }

    public boolean contains(T val) {
        for (T t : arr) {
            if (t == val) {
                return true;
            }
        }
        return false;
    }


    public int size() {
        int size = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != null) {
                size++;
            }
        }
        return size;
    }
}