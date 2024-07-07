/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.controller;

import pos_system.dto.OrderDto;
import pos_system.service.ServiceFactory;
import pos_system.service.custom.OrderService;

/**
 *
 * @author anjan
 */
public class OrderController {
    
    private OrderService orderService = (OrderService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ORDER);
    
    public String placeOrder(OrderDto orderDto) throws Exception{
        return orderService.placeOrder(orderDto);
    }
    
}
