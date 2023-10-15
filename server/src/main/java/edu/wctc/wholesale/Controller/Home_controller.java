package edu.wctc.wholesale.Controller;

import edu.wctc.wholesale.Entity.Wholesale_order;
import edu.wctc.wholesale.Repository.Wholesale_Order_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class Home_controller {
    private final Wholesale_Order_Repository repository;
    @Autowired
    public Home_controller (Wholesale_Order_Repository repository) {
        this.repository = repository;
    }
    @RequestMapping("/")
    public String getHomePage(Model model){
        List<Wholesale_order> orders = new ArrayList<>();
        repository.findAll().forEach(orders::add);
        model.addAttribute("orderList", orders);
        return "index";
    }
}
