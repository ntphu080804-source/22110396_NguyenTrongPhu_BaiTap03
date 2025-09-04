package service;
import dao.UserDao;
import dao.UserDaoImpl;
import model.user;
public class UserServiceImpl implements UserService{
	UserDao userDao = new UserDaoImpl();

    @Override
    public user login(String username, String password) {
    	user user = this.get(username);
    	if (user != null && password.equals(user.getPassWord())) {
    	return user;
    	}
    	return null;

    }

    @Override
    public user get(String username) {
        return userDao.get(username);
    }
}
