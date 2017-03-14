package lkwid.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkwid.dao.UserDao;
import lkwid.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;	

	public Collection<User> getAllUsers() {
		return userDao.findAll();
	}
	
	public User getUser(long id) {
		return userDao.findOne(id);
	}
	
	public void createUser(User user) {		
		userDao.save(user);
	}
	
	
}
