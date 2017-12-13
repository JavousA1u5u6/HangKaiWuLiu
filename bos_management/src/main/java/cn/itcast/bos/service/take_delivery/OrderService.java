package cn.itcast.bos.service.take_delivery;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import cn.itcast.bos.domain.take_delivery.Order;

public interface OrderService {

	@Path("/order")
	@POST
	@Consumes({ "application/xml", "application/json" })
	public void saveOrder(Order order);

	public Order findByOrderNum(String orderNum);
}
