package com.bbking.milk.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbking.milk.mapper.UserMapper;
import com.bbking.milk.entity.User;
import com.bbking.milk.service.interfaces.IUserManageSV;

/**  
 * 
 * @ClassName: UserManageSVImpl.java
 * @Description: ����Ĺ�������
 *
 * @version: v1.0.0
 * @author: ruanxl
 * @date: 2018��5��7�� ����4:59:40 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2018��5��7��     ruanxl           v1.0.0               �޸�ԭ��
*/
@Service
public class UserManageSVImpl implements IUserManageSV{
	  Log log = LogFactory.getLog(IUserManageSV.class);
	  
	  @Autowired
	  private UserMapper userDao;
	  
	  public void insert(User user){
		  userDao.insert(user);
	  }
	  
}
