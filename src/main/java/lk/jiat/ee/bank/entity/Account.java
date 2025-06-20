package lk.jiat.ee.bank.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String accounNo;
    private  double balance;
    @ManyToOne(cascade = CascadeType.ALL)
    private  User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccounNo() {
        return accounNo;
    }

    public void setAccounNo(String accounNo) {
        this.accounNo = accounNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
