package com.lyk.test;

import com.lyk.dao.OrderDao;
import com.lyk.dao.impl.OrderDaoImpl;
import com.lyk.pojo.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderDaoTest {

    @Test
    public void saveOrder() {

        OrderDao orderDao = new OrderDaoImpl();

        orderDao.saveOrder(new Order("1234567891", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), new BigDecimal(100), 0, 1));

    }

    @Test
    public void queryMyOrders() {
        OrderDao orderDao = new OrderDaoImpl();
        System.out.println(orderDao.queryMyOrders(1));
    }

    @Test
    public void queryOrderDetailById() {
    }

    @Test
    public void queryAllOrders() {
    }

    @Test
    public void changeOrderStatus() {
    }
}