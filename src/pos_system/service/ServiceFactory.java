/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.service;

import pos_system.service.custom.impl.CustomerServiceImpl;
import pos_system.service.custom.impl.ItemServiceImpl;
import pos_system.service.custom.impl.OrderServiceImpl;

/**
 *
 * @author anjan
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ORDER:
                return new OrderServiceImpl();
            default:
                return null;
        }
    }
    
     public enum ServiceType{
        ITEM, CUSTOMER, ORDER
    }
}
