/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos_system.dao;

import pos_system.dao.custom.impl.CustomerDaoImpl;
import pos_system.dao.custom.impl.ItemDaoImpl;
import pos_system.dao.custom.impl.OrderDaoImpl;
import pos_system.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author anjan
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDao(DaoTypes type) {
        switch (type) {
            case ITEM:
                return new ItemDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case ORDER:
                return new OrderDaoImpl();
            case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        ITEM, CUSTOMER, ORDER, ORDER_DETAIL
    }
}
