/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos_system.service.custom;

import pos_system.dto.CustomerDto;
import pos_system.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public interface CustomerService extends SuperService{
    public String save(CustomerDto customerDto) throws Exception;
    public String update(CustomerDto customerDto) throws Exception;
    public String delete(String custId) throws Exception;
    public CustomerDto get(String custId) throws Exception;
    public ArrayList<CustomerDto> getAll() throws Exception;
}
