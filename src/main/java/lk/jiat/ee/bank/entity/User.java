package lk.jiat.ee.bank.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "User.FindByEmail",query = "select u from  User u where u.email=:email"),
        @NamedQuery(name = "User.FindByEmailAndPassword",query = "select u from  User u where u.email=:email and  u.password=:password" )
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public List<Account> getAccounts() {
        return accounts;
    }
    public User(){}
    public User( String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    private String name;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


    @OneToMany(mappedBy = "user")
    private List<Account> accounts= new ArrayList<Account>();

}
