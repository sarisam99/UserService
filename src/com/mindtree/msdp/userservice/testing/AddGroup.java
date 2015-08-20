/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.entity.Group;
import com.mindtree.msdp.userservice.rest.UserService;

/**
 * @author M1018352
 *
 */
public class AddGroup {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		// change Group code to get 200 response
		Group group=new Group();
		group.setGroupCode("cloud009");
		group.setGroupDescription("amazon web services");
		group.setGroupId("cloud");
		group.setGroupName("cloud minds");
		group.setProductSlugName("TESTCOE");
		group.setTenantId(200);
		group.setTenantSlugName("selenium");
		
		UserService userService=new UserService();
		userService.addGroup(group);
	}

}
