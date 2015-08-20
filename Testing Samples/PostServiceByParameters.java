/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.client.UserService;

/**
 * @author M1018352
 *
 */
public class PostServiceByParameters {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		UserService userService=new UserService();
		
		//Register User Services
	//	userService.registerUser("sariputra","sariputra","MAAS","POSS");
		
		//Validate User Services
		userService.validateUser("sariputra","sariputra","MAAS","POSS");
		
		//Delete group by parameter values
	//	userService.deleteGroup(8, "groupCode1", "productSlugName1");
		
		//Delete department service
	//	userService.deleteDepartment(9, "departmentCode1", "productSlugName1");
		
		// Assign User To Group 
	//	userService.assignUserToGroup(4, "rama", "groupCode1");
		
		// Assign User To Department 
	//	userService.assignUserToDepartment(4, "rama", "departmentCode1");
		
		
	}

}
