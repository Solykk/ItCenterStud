package managerJavaFX.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Solyk on 19.03.2016.
 */
@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "CUSTOMERS_SEQ",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders = new HashSet<Order>();

    public Customer(){}

    public Customer(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
