package _01_Custom_ArrayList;

import java.awt.*;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[10];
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
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		if (loc > arr.length) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = arr.length-1; i > loc; i--) {
			arr[i] = arr[i-1];
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

		return arr.length;
	}
}