package edu.wctc.wholesale.Controller;

import edu.wctc.wholesale.Entity.Wholesale_order;
import edu.wctc.wholesale.Repository.Wholesale_Order_Repository;
import edu.wctc.wholesale.dto.DtoOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class Order_controller {
//private final Sales_order_service sales_order_service;
private final Wholesale_Order_Repository repository;
    @Autowired
    public Order_controller(Wholesale_Order_Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public List<DtoOrder> getOrders(Wholesale_order wholesale_order) {
        List<DtoOrder> orders = new ArrayList<>();
        repository.findAll().forEach((order)->orders.add(DtoOrder.fromEntity(wholesale_order)));
        return orders;
    }

}
