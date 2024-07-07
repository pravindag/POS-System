/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.dao.custom.impl;

import pos_system.dao.CrudUtil;
import pos_system.dao.custom.CustomerDao;
import pos_system.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author anjan
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public String save(CustomerEntity entity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)",
                    entity.getCustId(),entity.getTitle(), entity.getName(),
                    entity.getDob(), entity.getSalary(), entity.getAddress(), 
                    entity.getCity(), entity.getProvince(), entity.getZip());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(CustomerEntity entity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?",
                    entity.getTitle(), entity.getName(),
                    entity.getDob(), entity.getSalary(),
                    entity.getAddress(), entity.getCity(),
                    entity.getProvince(), entity.getZip(),entity.getCustId());
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String custID) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM customer WHERE CustID =?", custID);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public CustomerEntity get(String custID) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE CustID = ?", custID);
        if(rst.next()){
            return new CustomerEntity(rst.getString("CustID"),
                    rst.getString("CustTitle"), 
                    rst.getString("CustName"), 
                    rst.getString("DOB"), 
                    rst.getDouble("salary"), 
                    rst.getString("CustAddress"),
                    rst.getString("City"), 
                    rst.getString("Province"), 
                    rst.getString("PostalCode"));
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer");
        while (rst.next()) {
            CustomerEntity entity = new CustomerEntity(rst.getString("CustID"), rst.getString("CustTitle"),
                    rst.getString("CustName"), rst.getString("DOB"), rst.getDouble("salary"), 
                    rst.getString("CustAddress"), rst.getString("City"), rst.getString("Province"), 
                    rst.getString("PostalCode"));
            customerEntitys.add(entity);
        }

        return customerEntitys;
    }

}
