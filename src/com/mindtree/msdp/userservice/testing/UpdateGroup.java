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
public class UpdateGroup {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		Group group=new Group();
		group.setGroupCode("cloud007");
		group.setGroupDescription("amazon web services");
		group.setGroupId("cloud");
		group.setGroupName("cloud minds");
		group.setProductSlugName("TESTCOE");
		group.setTenantId(200);
		group.setTenantSlugName("selenium");
		
		UserService userService=new UserService();
		userService.updateGroup(group);
	}

}
