package edu.wctc.wholesale.Repository;

import edu.wctc.wholesale.Entity.Wholesale_order;
import org.springframework.data.repository.CrudRepository;

public interface Product_Repository extends CrudRepository<Wholesale_order, Integer> {

}
