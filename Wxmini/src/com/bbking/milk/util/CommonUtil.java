package com.bbking.milk.util;

import java.util.UUID;


/**  
 * 
 * @ClassName: CommonUtil.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: ruanxl
 * @date: 2018年5月7日 下午4:59:10 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2018年5月7日     ruanxl           v1.0.0               修改原因
*/
public class CommonUtil {
	/**
	 * 
	 * @Function: CommonUtil::generateUUID
	 * @Description: 生成唯一ID
	 * @return uuid
	 * @version: v1.0.0
	 * @author: ruanxl
	 * @date: 2018年5月7日 下午5:01:39 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 */
	public static String generateUUID(){
		String uuid = UUID.randomUUID().toString();
		return uuid.substring(0,8) + uuid.substring(9,13) + 
				uuid.substring(14,18) + uuid.substring(19,23) + uuid.substring(24);
	}
	
	
	
	
	
	public static void main(String[] args){
		System.out.println(generateUUID());
	}
}
