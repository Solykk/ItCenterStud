package managerJavaFX.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Solyk on 19.03.2016.
 */
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "ORDERS_SEQ",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATE_OF_ORDER")
    private Date dateOfOrder;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "SUM")
    private Double sum;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    public Order(){}

    public Order(Date dateOfOrder, Long amount, Customer customer, User user, Product product) {
        this.dateOfOrder = dateOfOrder;
        this.amount = amount;
        this.customer = customer;
        this.user = user;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", dateOfOrder=" + dateOfOrder +
                ", amount=" + amount +
                ", sum=" + sum +
                ", customer=" + customer +
                ", user=" + user +
                ", product=" + product +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
