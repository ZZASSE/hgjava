package com.yedam.collection;

public class Box<T> {
	T obj;

	void setObj(T _obj) {
		this.obj = _obj;
	}

	T getObj() {
		return obj;
	}
}
