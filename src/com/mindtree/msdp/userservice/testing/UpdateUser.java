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
public class UpdateUser {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {
		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2019-06-13T06:23:01.3480062+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("10176f2d-e04c-47fc-8c17-bf67436f9e79");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);
		
		UserService service =new UserService();
		service.updateUser(data);
	}

}
