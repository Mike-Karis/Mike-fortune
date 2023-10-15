package edu.wctc.wholesale.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.wholesale.Entity.Wholesale_order;
import edu.wctc.wholesale.Repository.Wholesale_Order_Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Sales_order_service {
    private final Wholesale_Order_Repository wholesale_Order_Repository;
    private final ObjectMapper objectMapper;


    public Sales_order_service(Wholesale_Order_Repository wholesale_Order_Repository, ObjectMapper objectMapper) {
        this.wholesale_Order_Repository = wholesale_Order_Repository;
        this.objectMapper = objectMapper;
    }

    public List<Wholesale_order> findAll() {
        List<Wholesale_order> list = new ArrayList<>();
        wholesale_Order_Repository.findAll().forEach(list::add);
        return list;
    }
}