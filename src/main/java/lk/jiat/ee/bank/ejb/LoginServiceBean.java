package lk.jiat.ee.bank.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lk.jiat.ee.bank.ejb.remote.LoginService;
import lk.jiat.ee.bank.entity.User;

@Stateless
public class LoginServiceBean implements LoginService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean login(String email, String password) {
    User user=    em.createNamedQuery("User.FindByEmailAndPassword", User.class)
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();

        return user != null;
    }
}
