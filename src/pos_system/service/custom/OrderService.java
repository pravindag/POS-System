/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos_system.service.custom;

import pos_system.dto.OrderDto;
import pos_system.service.SuperService;

/**
 *
 * @author anjan
 */
public interface OrderService extends SuperService{
    public String placeOrder(OrderDto orderDto) throws Exception;
}
