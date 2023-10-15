package edu.wctc.wholesale.dto;


import edu.wctc.wholesale.Entity.Wholesale_order;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DtoOrder {
    public int id;
    public String purchaseOrderNumber;
    public String terms;
    public String customerName;
    public String productName;
    public LocalDate purchaseDate;
    public LocalDate shippedDate;
    public double productCost;

    public static DtoOrder fromEntity(Wholesale_order wholesale_order){
        DtoOrder _order = new DtoOrder();
        _order.id = wholesale_order.getId();
        _order.purchaseOrderNumber = wholesale_order.getPurchaseOrderNumber();
        _order.terms = wholesale_order.getTerms();
        _order.customerName = wholesale_order.getCustomer().getName();
        _order.productName = wholesale_order.getProduct().getName();
        _order.purchaseDate = wholesale_order.getPurchase_date();
        _order.shippedDate = wholesale_order.getShipped_date();
        _order.productCost = wholesale_order.getProduct().getCost();
        return _order;
    }
}
