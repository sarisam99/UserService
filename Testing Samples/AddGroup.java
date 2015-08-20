/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.client.UserService;
import com.mindtree.msdp.userservice.entity.Group;

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

		Group group=new Group();
		group.setGroupCode("groupCode1");
		group.setGroupDescription("groupDescription1");
		group.setGroupId("groupId1");
		group.setGroupName("groupName1");
		group.setProductSlugName("productSlugName 1");
		group.setTenantId(4);
		group.setTenantSlugName("tenantSlugName1");
		
		UserService userService=new UserService();
		userService.addGroup(group);
	}

}
