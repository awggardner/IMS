package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {



private List<Item> items = new ArrayList<>();
	
	public void addItem(Item i) {
		this.items.add(i);
	}
	
	public void removeItem(Item i) {
		this.items.remove(i);
	}
	
	public void removeItem(int itemId) {
		for (int i = 0; i < this.items.size(); i++) {
			if (this.items.get(i).getItemId() == itemId) {
				this.items.remove(i);
				break;
			}
		}
	}
	



}




