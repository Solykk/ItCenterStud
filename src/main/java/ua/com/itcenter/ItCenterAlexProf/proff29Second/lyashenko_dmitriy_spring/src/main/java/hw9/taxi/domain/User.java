package hw9.taxi.domain;

import javax.persistence.*;

/**
 * Created by Solyk on 01.03.2016.
 */
@Entity
@Table(name = "USERS")
public class User {


    @Column(name = "ID")
    private String id;

    @Id
    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    public User(){}

    public User(String login,String id, String password){
        this.login = login;
        this.id = id;
        this.password = password;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
