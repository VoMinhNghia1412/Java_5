package com.PS23109.utils;

import java.util.*;

import com.PS23109.entity.Item;



public class DB {
	public static Map<Integer, Item> items = new HashMap<>();
	static {
		items.put(1, new Item());
		items.put(2, new Item());
		items.put(3, new Item());
		items.put(4, new Item());
		items.put(5, new Item());
	}
}


