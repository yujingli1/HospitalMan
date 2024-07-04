package com.stesla.hospital.service;

import com.stesla.hospital.pojo.Orders;

import java.util.HashMap;
import java.util.List;

public interface OrderService {
    HashMap<String, Object> findAllOrders(int pageNumber, int size, String query);
    Boolean deleteOrder(int oId);
    Boolean addOrder(Orders order, String arId);
    List<Orders> findOrderByPid(int pId);
    List<Orders> findOrderByNull(int dId, String oStart);
    Boolean updateOrder(Orders orders);
    Boolean updatePrice(int oId);
    HashMap<String, Object> findOrderFinish(int pageNumber, int size, String query, int dId);
    HashMap<String, Object> findOrderByDid(int pageNumber, int size, String query, int dId);
    int orderPeople(String oStart);
    int orderPeopleByDid(String oStart, int dId);
    List<String> orderGender();
    Boolean updateOrderByAdd(Orders order);
    Boolean findTotalPrice(int oId);
    HashMap<String, String> findOrderTime(String arId);
    List<String> orderSection();
}