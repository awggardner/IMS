package com.qa.ims.persistence.domain;

public class Order extends Customer {



	private Long orderId;
	

	public Order(Long orderId, Long id) {
		super(id, firstName, firstName);
		this.orderId = orderId;
		
	}
	

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	

	@Override
	public String toString() {
		return "Order id: " + orderId + " first name:" + Customer.firstName + "last name " + Customer.surname;
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



