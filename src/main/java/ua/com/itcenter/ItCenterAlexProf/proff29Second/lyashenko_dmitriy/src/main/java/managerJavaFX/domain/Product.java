package managerJavaFX.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Solyk on 19.03.2016.
 */
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "PRODUCTS_SEQ",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @OneToMany(mappedBy = "product")
    private Set<Order> products = new HashSet<Order>();

    public Product(){}

    public Product(String name, Double price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Order> getProducts() {
        return products;
    }

    public void setProducts(Set<Order> products) {
        this.products = products;
    }
}
