package edu.wctc.wholesale.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name="wholesale_order")
@Data
@NoArgsConstructor
public class Wholesale_order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int id;
    @Column(name="purchase_order_num")
    private String purchaseOrderNumber;
    @Column(name="terms")
    private String terms;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="customer_id")
    private Customer customer;
    @OneToOne
    @JsonBackReference
    @JoinColumn(name="product_id")
    private Product product;
    @Column(name="purchase_date")
    private LocalDate purchase_date;
    @Column(name="shipped_date")
    private LocalDate shipped_date;
}
