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
public class AddDepartment {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 * @throws HttpException 
	 * @throws InvalidKeyException 
	 */
	public static void main(String[] args) throws InvalidKeyException, HttpException, NoSuchAlgorithmException, IOException {

		DepartmentData departmentData =new DepartmentData();
		departmentData.setDepartmentCode("departmentCode1");
		departmentData.setDepartmentDescription("departmentDescription1");
		departmentData.setDepartmentId("departmentId1");
		departmentData.setDepartmentName("departmentName1");
		departmentData.setProductSlugName("productSlugName1");
		//Change tenant id every time or else it throw exception
		departmentData.setTenantId(4);
		departmentData.setTenantSlugName("tenantSlugName1");
		
		UserService userService=new UserService();
		userService.addDepartment(departmentData);
	}

}
