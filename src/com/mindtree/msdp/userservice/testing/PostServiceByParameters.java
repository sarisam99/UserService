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
public class PostServiceByParameters {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		/**
		 * Inputs 
		 * tenantId =200
		 * productSlugName = TESTCOE
		 * departmentCode=cloudDepartment007
		 * TenantSlugName =selenium
		 * groupCode =cloud007
		 * userId = 10176f2d-e04c-47fc-8c17-bf67436f9e79
		 */
		
		UserService userService=new UserService();
		
		//Register User Services
	//	userService.registerUser("sariputra","sariputra","MAAS","TESTCOE");
		
		//Validate User Services
	//	userService.validateUser("sariputra","sariputra","MAAS","TESTCOE");
		
		//Delete group by parameter values
	//	userService.deleteGroup(8, "groupCode1", "productSlugName1");
		
		//Delete department service
	//	userService.deleteDepartment(9, "departmentCode1", "productSlugName1");
		
		// Assign User To Group 
	//	userService.assignUserToGroup(200, "sariputra", "cloud007");
		
		// Assign User To Department 
	//	userService.assignUserToDepartment(200, "sariputra", "cloudDepartment007");
		
		
	}

}
