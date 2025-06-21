package lk.jiat.ee.bank.ejb;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lk.jiat.ee.bank.ejb.remote.RegisterService;
import lk.jiat.ee.bank.entity.User;

@Stateless
@Local(RegisterService.class)
public class RegisterServiceBean implements RegisterService{

    @PersistenceContext(unitName = "BankPU")
    private EntityManager em;

    public void registerUser(String name, String email, String password) {
        if (em == null) {
            throw new IllegalStateException("EntityManager is not injected!");
        }

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        em.persist(user);
    }
}

