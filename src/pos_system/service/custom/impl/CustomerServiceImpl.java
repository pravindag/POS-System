/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.service.custom.impl;

import pos_system.dao.DaoFactory;
import pos_system.dao.custom.CustomerDao;
import pos_system.dto.CustomerDto;
import pos_system.entity.CustomerEntity;
import pos_system.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class CustomerServiceImpl implements CustomerService {
    
    private CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String save(CustomerDto dto) throws Exception {
        CustomerEntity entity = getCustomerEntity(dto);
        return customerDao.save(entity);
    }

    @Override
    public String update(CustomerDto dto) throws Exception {
        CustomerEntity entity = getCustomerEntity(dto);
        return customerDao.update(entity);
    }

    @Override
    public String delete(String custId) throws Exception {
        return customerDao.delete(custId);
    }

    @Override
    public CustomerDto get(String custId) throws Exception {
        CustomerEntity entity = customerDao.get(custId);
        return getCustomerDto(entity);
    }

    @Override
    public ArrayList<CustomerDto> getAll() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        for (CustomerEntity customerEntity : customerEntitys) {
            CustomerDto dto = getCustomerDto(customerEntity);
            customerDtos.add(dto);
        }
        return customerDtos;
    }
    
    private CustomerDto getCustomerDto(CustomerEntity entity){
        CustomerDto customerEntityDto = new CustomerDto(entity.getCustId(),
                    entity.getTitle(), entity.getName(),
                    entity.getDob(), entity.getSalary(),
                    entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip());
        return customerEntityDto;
    }
    
    private CustomerEntity getCustomerEntity(CustomerDto dto){
         CustomerEntity entity = new CustomerEntity(dto.getCustId(),
                    dto.getTitle(), dto.getName(),
                    dto.getDob(), dto.getSalary(),
                    dto.getAddress(), dto.getCity(),
                    dto.getProvince(), dto.getZip());
         return entity;
    }

}
