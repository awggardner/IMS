package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class Order  {



	private Long orderId;
	private Customer customer;
	
	// create an arraylist to store items in an order
	private List<Item> orderitems = new ArrayList<Item>();

	// add item to orderitems list
	public void addOrderItem(Item item) {
		this.orderitems.add(item);
	}
	
	// remove item from orderitems
	public void removeOrderItem(Item item) {
		this.orderitems.remove(item);
	}
	
	
	
// taking these out for now but will need them for deleting orders?	
//	public Long getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Long orderId) {
//		this.orderId = orderId;
//	}

	
	// returns order ID, customer name, orderitems
	@Override
	public String toString() {
		return "Order id: " + orderId + " first name:" + this.customer.getFirstName() + 
				"last name " + this.customer.getSurname() + orderitems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		
		return true;
	}

}



