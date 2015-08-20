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
public class GetServiceByParameters {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		UserService userService = new UserService();
		
		

		// Get USER_DETAILS_BY_USERNAME
	// userService.getUserDetailsByUserName(4, "rama", "TESTCOE");

		// Get USER_DETAILS_BY_USERID
	//	userService.getUserDetailsByUserId(4, "a79540f1-baf2-4143-9a86-fe69459f8101", "TESTCOE");

		// Get ANONYMOUS USERS
	//	userService.getAnonymousUsers(4, "TESTCOE");
		
		//Get User by Tenant Id and productName
	//	userService.getUsers(4, "TESTCOE");
		
		//GetStoredProcedureData
	//	userService.getStoredProcedureData(2, 1, 2);
		
		// Get Group Details 
	//	userService.getGroupDetails(4, "groupCode1", "TESTCOE");
		
		//get Group for tenant Id
	//	userService.getGroups(4);
		
		//get DepartmentDetails
	//	userService.getDepartmentDetails(4, "departmentCode1", "productSlugName1");
		
		//get Department for Tenant Id 
	//userService.getDepartments(4);
		
		
		
	}

}


