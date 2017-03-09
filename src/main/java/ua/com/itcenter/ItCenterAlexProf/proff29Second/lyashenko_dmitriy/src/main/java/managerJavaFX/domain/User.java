package managerJavaFX.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Solyk on 19.03.2016.
 */

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @SequenceGenerator(name = "sequence", sequenceName = "USERS_SEQ",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "IS_ADMIN")
    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    private Set<Order> users = new HashSet<Order>();

    public User(){}

    public User(String name, boolean isAdmin){
        this.name = name;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isAdmin=" + isAdmin +
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
