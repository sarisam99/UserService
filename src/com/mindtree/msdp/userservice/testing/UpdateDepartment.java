/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.entity.DepartmentData;
import com.mindtree.msdp.userservice.rest.UserService;

/**
 * @author M1018352
 *
 */
public class UpdateDepartment {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		DepartmentData departmentData =new DepartmentData();
		departmentData.setDepartmentCode("cloudDepartment007");
		departmentData.setDepartmentDescription("amazon web service department");
		departmentData.setDepartmentId("cloud department");
		departmentData.setDepartmentName("cloud mind department");
		departmentData.setProductSlugName("TESTCOE");
		
		departmentData.setTenantId(200);
		departmentData.setTenantSlugName("selenium");
		
		UserService userService=new UserService();
		userService.updateDepartment(departmentData);
	}

}
