/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.controller;

import java.util.ArrayList;
import pos_system.dto.CustomerDto;
import pos_system.service.ServiceFactory;
import pos_system.service.custom.CustomerService;

/**
 *
 * @author anjan
 */
public class CustomerController {
    
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
    
    public String saveCustomer(CustomerDto customerDto) throws Exception{
        return customerService.save(customerDto);
    }
    
    public String updateCustomer(CustomerDto customerDto) throws Exception{
        return customerService.update(customerDto);
    }
    
    public String deleteCustomer(String custId) throws Exception{
        return customerService.delete(custId);
    }
    
    public CustomerDto getCustomer(String custId) throws Exception{
        return customerService.get(custId);
    }
    
    public ArrayList<CustomerDto> getCustomerAll() throws Exception{
        return customerService.getAll();
    }
}
