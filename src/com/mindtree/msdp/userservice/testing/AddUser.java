/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.entity.UserData;
import com.mindtree.msdp.userservice.rest.UserService;

/**
 * @author M1018352
 * 
 */
public class AddUser {
	public static void main(String[] args) throws InvalidKeyException,
			HttpException, NoSuchAlgorithmException, IOException {
		//change either tenant id or Email id to get 200 response
		//if data.setIsAnonymous(true) then he is anonymous user. 
		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		userService.addUser(data);

	}
}
