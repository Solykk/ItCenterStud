package hw9.taxi.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Solyk on 02.03.2016.
 */
@Entity
@Table(name = "CLIENTS")
@SequenceGenerator(name = "seqOfClients", sequenceName = "CLIENTS_SEQ")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqOfClients")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "PHONE_NUMBER")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "SUM_OF_ORDERS")
    private Double sum;

    @Column(name = "DATE_OF_LAST_ORDER")
    private Date dateOfLastOrder;

    @OneToMany(mappedBy = "client")
    private Set<Order> orders = new HashSet<Order>();


    public Client (){}

    public Client(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", sum=" + sum +
                ", dateOfLastOrder=" + dateOfLastOrder +
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Date getDateOfLastOrder() {
        return dateOfLastOrder;
    }

    public void setDateOfLastOrder(Date dateOfLastOrder) {
        this.dateOfLastOrder = dateOfLastOrder;
    }
}
