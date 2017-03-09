package hw9.taxi.domain;



import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Solyk on 03.03.2016.
 */
@Entity
@Table(name = "ORDERS")
@SequenceGenerator(name = "seqOfOrders", sequenceName = "ORDERS_SEQ")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqOfOrders")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "AMOUNT")
    private String amount;

    @Column(name = "ADDRESS_FROM")
    private String addressFrom;

    @Column(name = "ADDRESS_TO")
    private String addressTo;

    @Column(name = "DATE_OF_ORDER")
    private Date dateOfOder;

    public Order(){}

    public Order(Client client, String amount, String addressFrom, String addressTo){
        int tempLong = hw8.taxi.service.OrderServiceImpl.orders.size() + 1;
        long tmpFromInt = tempLong;
        this.id = tmpFromInt;
        this.client = client;
        this.amount = amount;
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.dateOfOder = new Date();
//        this.client.setSumma( this.client.getSumma() + (long)Long.valueOf(amount));
//        this.client.setDateOfLastOrder(this.dateOfOder);
    }

    @Override
    public String toString() {
        return "Order № " + id + " from "+
                new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z").format(dateOfOder) +
                "\n" + client.toString() + " amount " + amount +
                "\n" +"from " + addressFrom + " to " + addressTo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(String addressFrom) {
        this.addressFrom = addressFrom;
    }

    public String getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(String addressTo) {
        this.addressTo = addressTo;
    }

    public Date getDateOfOder() {
        return dateOfOder;
    }

    public void setDateOfOder(Date dateOfOder) {
        this.dateOfOder = dateOfOder;
    }
}
