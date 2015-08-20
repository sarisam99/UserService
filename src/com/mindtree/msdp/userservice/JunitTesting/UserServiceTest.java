/**
 * 
 */
package com.mindtree.msdp.userservice.JunitTesting;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.httpclient.HttpException;
import org.junit.Assert;
import org.junit.Test;

import com.mindtree.msdp.userservice.entity.DepartmentData;
import com.mindtree.msdp.userservice.entity.Group;
import com.mindtree.msdp.userservice.entity.UserData;
import com.mindtree.msdp.userservice.rest.UserService;

/**
 * @author M1018352
 * 
 */
public class UserServiceTest {

	private boolean outputValueFromRestService;
	private UserService userService = new UserService();
	@Test
	public void addUserTest1() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {
		// Test is successful because data is not present in database
		// Note : change data every time when you are using this Test Method or
		// test will fail
		// Expecting 200 response
		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("newEmail4@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean value = userService.addUser(data);

		Assert.assertEquals(true, value);

	}

	public void addUserTest2() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {
		// Test is successful because data is already present in database
		// Expecting 500 response
		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra99@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean value = userService.addUser(data);

		Assert.assertEquals(false, value);

	}

	public void addAnonymousUserTest1() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {
		// Test is successful because data is not present in database
		// Note : change data every time when you are using this Test Method or
		// test will fail
		// Expecting 200 response

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputraAnonymous4@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(true);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);
		data.setProductSlugName("TESTCOE");
		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean value = userService.addAnonymousUser(data);
		Assert.assertEquals(true, value);
	}

	public void addAnonymousUserTest2() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {
		// Test is successful because data is already present in database and we
		// are expecting 500 response

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputraAnonymous@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(true);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);
		data.setProductSlugName("TESTCOE");
		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean value = userService.addAnonymousUser(data);
		Assert.assertEquals(false, value);
	}

	public void addTenantAdminUserTest1() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {

		// Test is successful because data is not present in database
		// Note : change data every time when you are using this Test Method or
		// else
		// test will fail
		// Add tenant admin user is also same as adding new user ...change email
		// id or tenant Name to get 200 response
		// Expecting 200 response
		UserData data = new UserData();

		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputraAdmin7@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean outputValueFromRestService = userService
				.addTenantAdminUser(data);
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void addTenantAdminUserTest2() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {

		// Test is successful because data is already present in database
		// Note : change data every time when you are using this Test Method or
		// else
		// test will fail
		// Add tenant admin user is also same as adding new user
		// Expecting 500 response
		// Boolean : false
		UserData data = new UserData();

		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputraAdmin7@gmail.com");
		data.setExpiry("2014-05-13T06:23:01.3480052+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("3858D1BA-5z98-4EBC-AC24-0C20E03C8189");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService userService = new UserService();
		boolean outputValueFromRestService = userService
				.addTenantAdminUser(data);
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void updateUserTest1() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2019-06-13T06:23:01.3480062+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("10176f2d-e04c-47fc-8c17-bf67436f9e79");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService service = new UserService();
		boolean outputValueFromRestService = service.updateUser(data);
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void updateUserTest2() throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2019-06-13T06:23:01.3480062+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("176f2d-e04c-47fc-8c17-bf67436f9e79");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService service = new UserService();
		boolean outputValueFromRestService = service.updateUser(data);
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void approveUserTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// Approve user based on user id (user id should be present in database)
		// Boolean : true

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2019-06-13T06:23:01.3480062+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("10176f2d-e04c-47fc-8c17-bf67436f9e79");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService service = new UserService();
		boolean outputValueFromRestService = service.approveUser(data);
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void approveUserTest2() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {
		// Approve user based on user id (user id should be present in database)
		// Boolean : false

		UserData data = new UserData();
		data.setComment("sample string 11");
		data.setCreatedBy("sample string 15");
		data.setCreatedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setEmail("sariputra@gmail.com");
		data.setExpiry("2019-06-13T06:23:01.3480062+00:00");
		data.setFirstName("sariputra");
		data.setIsAnonymous(false);
		data.setLastName("lingadalli");
		data.setModifiedBy("sample string 15");
		data.setModifiedOn("2014-05-13T06:23:01.3480052+00:00");
		data.setPhone(1111111111);

		data.setProductSlugName("TESTCOE");

		data.setTenantId(200);
		data.setUserId("176f2d-e04c-47fc-8c17-bf67436f9e79");
		data.setUserName("sariputra");
		data.setUserRoleId(1);
		data.setUserRoleName("5052D06A-AA9F-48DF-A0E8-3F3E97FA0164");
		data.setUserStatus(1);

		UserService service = new UserService();
		boolean outputValueFromRestService = service.approveUser(data);
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void registerUserTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// Register user for tenant with valid username,password
		// boolen : true
		outputValueFromRestService = userService.registerUser("sariputra",
				"sariputra", "MAAS", "TESTCOE");
		Assert.assertEquals(true, outputValueFromRestService);

	}

	public void validateUserTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// validate user for tenant with valid username,password
		// Boolean : true
		outputValueFromRestService = userService.validateUser("sariputra",
				"sariputra", "MAAS", "TESTCOE");
		Assert.assertEquals(true, outputValueFromRestService);

	}

	public void validateUserTest2() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// validate user for tenant with valid username,password
		// Boolean : false
		outputValueFromRestService = userService.validateUser("sariputra",
				"sariputra", "MAAS", "dummy");
		Assert.assertEquals(false, outputValueFromRestService);

	}

	public void addGroupTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// insert new group code every time while running this method
		// Expected boolean value : true
		Group group = new Group();
		group.setGroupCode("cloud009");
		group.setGroupDescription("amazon web services");
		group.setGroupId("cloud");
		group.setGroupName("cloud minds");
		group.setProductSlugName("TESTCOE");
		group.setTenantId(200);
		group.setTenantSlugName("selenium");

		outputValueFromRestService = userService.addGroup(group);
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void addGroupTest2() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {
		// if you are inserting same group code every time while running this
		// method it will throw error
		// Expected boolean value : false
		Group group = new Group();
		group.setGroupCode("cloud009");
		group.setGroupDescription("amazon web services");
		group.setGroupId("cloud");
		group.setGroupName("cloud minds");
		group.setProductSlugName("TESTCOE");
		group.setTenantId(200);
		group.setTenantSlugName("selenium");

		outputValueFromRestService = userService.addGroup(group);
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void deleteGroupTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {
		// Before running this test method check whether groupCode is present or
		// not
		// Expected boolean Value : True

		outputValueFromRestService = userService.deleteGroup(200, "cloud008",
				"TESTCOE");
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void deleteGroupTest2() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {
		// This method shows if your are deleting group which is not present in
		// database .It will throw false boolean value
		// groupcode : cloud007 is not present in database
		// Expected boolean Value : True

		outputValueFromRestService = userService.deleteGroup(200, "cloud007",
				"TESTCOE");
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void addDepartmentTest1() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {
		// insert new DepartmentCode every time while running this method
		// Expected boolean value : true
		DepartmentData departmentData = new DepartmentData();
		departmentData.setDepartmentCode("cloudDepartment008");
		departmentData
				.setDepartmentDescription("amazon web service department");
		departmentData.setDepartmentId("cloud department");
		departmentData.setDepartmentName("cloud mind department");
		departmentData.setProductSlugName("TESTCOE");

		departmentData.setTenantId(200);
		departmentData.setTenantSlugName("selenium");

		outputValueFromRestService = userService.addDepartment(departmentData);
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void addDepartmentTest2() throws InvalidKeyException, HttpException,
			NoSuchAlgorithmException, IOException {

		// if you are inserting same DepartmentCode every time while running
		// this
		// method it will throw error
		// Expected boolean value : false
		DepartmentData departmentData = new DepartmentData();
		departmentData.setDepartmentCode("cloudDepartment008");
		departmentData
				.setDepartmentDescription("amazon web service department");
		departmentData.setDepartmentId("cloud department");
		departmentData.setDepartmentName("cloud mind department");
		departmentData.setProductSlugName("TESTCOE");

		departmentData.setTenantId(200);
		departmentData.setTenantSlugName("selenium");

		outputValueFromRestService = userService.addDepartment(departmentData);
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void deleteDepartmentTest1() throws InvalidKeyException,
			HttpException, NoSuchAlgorithmException, IOException {
		// Before running this test method check whether
		// departmentCode,ProductSlugName is present or not
		// Expected boolean Value : True

		outputValueFromRestService = userService.deleteDepartment(200,
				"cloudDepartment008", "TESTCOE");
		Assert.assertEquals(true, outputValueFromRestService);
	}

	public void deleteDepartmentTest2() throws InvalidKeyException,
			HttpException, NoSuchAlgorithmException, IOException {
		// This method shows if your are deleting group which is not present in
		// database .It will throw false boolean value
		// ProductSlugName : dummy is not present in database
		// Expected boolean Value : True
		outputValueFromRestService = userService.deleteDepartment(200,
				"cloudDepartment008", "dummy");
		Assert.assertEquals(false, outputValueFromRestService);
	}

	public void getUserDetailsByUserName1() throws Exception {
		// tenant id =10,username =girish123,Productslugname=WSTAF
		// Expected boolean : true
		String responseOutput = userService.getUserDetailsByUserName(10,
				"girish123", "WSTAF");

		boolean output;

		if (!responseOutput.contains("<UserName i:nil")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(true, output);

	}

	public void getUserDetailsByUserNameTest2() throws Exception {
		// give username = dummy ..which is not present in database
		// Expected boolean : false
		String responseOutput = userService.getUserDetailsByUserName(10,
				"dummyName", "WSTAF");

		boolean output;

		if (!responseOutput.contains("<UserName i:nil")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(false, output);

	}

	
	public void getUserDetailsByUserIdTest1() throws Exception {
		// tenantId =10, ,
		// userId =ec631edc-098b-4f42-844c-b2f9f6a5aa42
		// productName=WSTAF
		// Expected boolean : true

		String responseOutput = userService.getUserDetailsByUserId(10,
				"ec631edc-098b-4f42-844c-b2f9f6a5aa42", "WSTAF");

		boolean output;

		if (!responseOutput.contains("<UserData i:nil")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(true, output);

	}

	public void getUserDetailsByUserIdTest2() throws Exception {
		// Give userId = dummyUser which is not present in database .
		// Expected boolean : false

		String responseOutput = userService.getUserDetailsByUserId(10,
				"dummyUser", "WSTAF");

		boolean output;

		if (!responseOutput.contains("<UserData i:nil")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(false, output);

	}
	
	public void getAnonymousUserstest1() throws Exception {
		//Tenant id =200,ProductName=TESTCOE ...These are present in database.
		//expected boolean : true
		String responseOutput = userService.getAnonymousUsers(200, "TESTCOE");

		boolean output;

		if (responseOutput.contains("<Email>")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(true, output);

	}
	
	public void getAnonymousUserstest2() throws Exception {
		//Tenant id =99999 ...Tenant Id is not present in database.
		//Expected boolean : false

		String responseOutput = userService.getAnonymousUsers(99999, "TESTCOE");

		boolean output;

		if (responseOutput.contains("<Email>")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(false, output);

	}

	@Test
	public void getUsersTest1() throws Exception {
		//Tenant id =200,ProductName=TESTCOE ...These are present in database.
		//expected boolean : true
		String responseOutput = userService.getUsers(200, "TESTCOE");

		boolean output;

		if (responseOutput.contains("<Email>")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(true, output);

	}
	
	@Test
	public void getUsersTest2() throws Exception {
		//Tenant id =9999 .. Tenant Id is not present in database.
		//expected boolean : false
		String responseOutput = userService.getUsers(9999, "TESTCOE");

		boolean output;

		if (responseOutput.contains("<Email>")) {

			output = true;
		}

		else {
			output = false;
		}

		Assert.assertEquals(false, output);

	}
	
	

}
