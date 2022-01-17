package dao;

import model.Admin;
import model.Login;
import model.User;

public interface LoginDao {
	User getUser(Login login);
	Admin getAdmin(Login login);
	void putUser(User user);
	String getUserId(String USER_ID);
	String searchId(User user);
	String searchPwd(User user);
	void newPwd(User user);
}
