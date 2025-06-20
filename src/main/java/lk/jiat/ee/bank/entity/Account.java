package lk.jiat.ee.bank.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String accounNo;
    private  double balance;
    @ManyToOne
    private  User user;
}
