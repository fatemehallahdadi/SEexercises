package com.mapsa.exercise.seriesa.b;

import java.util.ArrayList;

public class CoffeeShopAllahdadi {
	String name;
	MenuItem[] menuItems;
	ArrayList<String> orders;

	public CoffeeShopAllahdadi(String name, MenuItem[] menu, ArrayList<String> orders) {
		this.menuItems=menu;
		this.orders=orders;
		this.name=name;
	}

	public Object addOrder(String order) {
		for (int i = 0; i <this.menuItems.length ; i++) {
			if(this.menuItems[i].getItem().equals(order))
				return "its unavailable";
			}
			this.orders.add(order);
			return "it is added";

	}

	public double dueAmount() {
		double sum=0;
		for (String a:
				this.orders ) {
			for (int i = 0; i < menuItems.length; i++) {
				if(a.equals(this.menuItems[i].getItem()))
					sum+=this.menuItems[i].getPrice();
			}
		}
		return sum;
	}

	public Object listOrders() {
		if (this.orders.isEmpty())
			return null;
		else
			return this.orders;
	}

	public Object fulfillOrder() {
		if (this.orders.isEmpty())
			return "All orders have been fulfilled!";
		else
			return "The {item} is ready!";
	}

	public Object cheapestItem() {
		double cheapest=this.menuItems[0].getPrice();
		String cheapestName="";
		for (int i = 1; i <this.menuItems.length ; i++) {
			if (this.menuItems[i].getPrice()<cheapest) {
				cheapest = this.menuItems[i].getPrice();
				cheapestName = this.menuItems[i].getItem();
			}


		}
		return cheapestName;
	}
	
}

