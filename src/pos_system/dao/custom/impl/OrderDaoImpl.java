/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.dao.custom.impl;

import pos_system.dao.CrudUtil;
import pos_system.dao.custom.OrderDao;
import pos_system.entity.OrderEntity;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class OrderDaoImpl implements OrderDao{

    @Override
    public String save(OrderEntity t) throws Exception {
        boolean isOrderSaved = CrudUtil.executeUpdate("INSERT INTO orders VALUES (?,?,?)", t.getOrderId(), t.getDate(), t.getCustId());
        return isOrderSaved? "Success" : "Fail";
    }

    @Override
    public String update(OrderEntity t) throws Exception {
        return null;
    }

    @Override
    public String delete(String id) throws Exception {
        return null;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
       return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }
    
}
