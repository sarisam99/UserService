/**
 * 
 */
package com.mindtree.msdp.userservice.testing;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;

import com.mindtree.msdp.userservice.client.UserService;
import com.mindtree.msdp.userservice.entity.DepartmentData;

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
		departmentData.setDepartmentCode("departmentCode 1");
		departmentData.setDepartmentDescription("departmentDescription 1");
		departmentData.setDepartmentId("departmentId 1");
		departmentData.setDepartmentName("departmentName 1");
		departmentData.setProductSlugName("productSlugName 1");
	
		departmentData.setTenantId(6);
		departmentData.setTenantSlugName("tenantSlugName 1");
		
		UserService userService=new UserService();
		userService.updateDepartment(departmentData);
	}

}
