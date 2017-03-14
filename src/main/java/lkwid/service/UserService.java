package lkwid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkwid.dao.UserDao;
import lkwid.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;	

	public void createUser(User user) {		
		userDao.save(user);
	}
	
	public User getUser(long id) {
		return userDao.findOne(id);
	}
	
}
