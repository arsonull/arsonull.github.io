package business;

import java.util.List;

import beans.Order;

public interface OrdersBusinessInterface 
{
	public void test();
	public List<Order> getOrders();
	public void setOrders(List<Order> orders);
}
