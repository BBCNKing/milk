package com.bbking.milk.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbking.milk.mapper.UserMapper;
import com.bbking.milk.entity.User;
import com.bbking.milk.service.interfaces.IUserManageSV;

@Service
public class UserManageSVImpl implements IUserManageSV{
	  Log log = LogFactory.getLog(IUserManageSV.class);
	  
	  @Autowired
	  private UserMapper userDao;
	  
	  public void insert(User user){
		  userDao.insert(user);
	  }
	  
}
