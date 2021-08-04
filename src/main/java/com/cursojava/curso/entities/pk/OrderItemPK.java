package com.cursojava.curso.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cursojava.curso.entities.Order;
import com.cursojava.curso.entities.Product;

@Embeddable
public class OrderItemPK implements Serializable{
    public static final long serialVersionUID = 1L;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof OrderItemPK)) {
            return false;
        }
        OrderItemPK orderItemPK = (OrderItemPK) o;
        return Objects.equals(order, orderItemPK.order) && Objects.equals(product, orderItemPK.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }


}
