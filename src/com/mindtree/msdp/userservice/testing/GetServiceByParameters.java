/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.rest.UserService;

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

		/**
		 * Inputs 
		 * tenantId =200
		 * productSlugName = TESTCOE
		 * departmentCode=cloudDepartment007
		 * TenantSlugName =selenium
		 * groupCode =cloud007
		 * userId = 10176f2d-e04c-47fc-8c17-bf67436f9e79
		 */
		
		
		
		UserService userService = new UserService();
		
		// Get USER_DETAILS_BY_USERNAME
	// userService.getUserDetailsByUserName(200, "sariputra", "TESTCOE");

		// Get USER_DETAILS_BY_USERID
		userService.getUserDetailsByUserId(200, "10176f2d-e04c-47fc-8c17-bf67436f9e79", "TESTCOE");

		// Get ANONYMOUS USERS
	//	userService.getAnonymousUsers(200, "TESTCOE");
		
		//Get User by Tenant Id and productName
	//	userService.getUsers(200, "TESTCOE");
		
		//GetStoredProcedureData
	//	userService.getStoredProcedureData(200, 1, 2);
		
		// Get Group Details 
	//	userService.getGroupDetails(200, "cloud007", "TESTCOE");
		
		//get Group for tenant Id
	//	userService.getGroups(200);
		
		//get DepartmentDetails
	//	userService.getDepartmentDetails(200, "cloudDepartment007", "TESTCOE");
		
		//get Department for Tenant Id 
	//userService.getDepartments(200);
		
		
		
		
		
	}

}


