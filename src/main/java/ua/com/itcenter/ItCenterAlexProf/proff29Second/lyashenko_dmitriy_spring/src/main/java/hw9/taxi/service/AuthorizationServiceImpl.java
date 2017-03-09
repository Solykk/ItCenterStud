package hw9.taxi.service;

import hw9.taxi.dao.UserDao;
import hw9.taxi.domain.User;
import hw9.taxi.exception.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Locale;

/**
 * Created by Solyk on 01.03.2016.
 */
@Service
@Transactional
public class AuthorizationServiceImpl implements AuthorizationService {

    public AuthorizationServiceImpl(){
        Locale.setDefault(Locale.ENGLISH);}

    @Autowired
    private UserDao userDao;


    @Override
    public boolean register(String login, String id, String pass)  throws AuthenticationException {
        User user = new User(login,id,pass);
        Long tmp = userDao.create(user);
        if(tmp == null){
            throw new AuthenticationException("false");
        } else {
            return  true;
        }

    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
