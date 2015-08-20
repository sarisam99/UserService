/**
 * 
 */
package com.mindtree.msdp.userservice.rest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import java.util.ResourceBundle;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import com.mindtree.msdp.userservice.dto.JAXBMarshall;
import com.mindtree.msdp.userservice.entity.DepartmentData;
import com.mindtree.msdp.userservice.entity.Group;
import com.mindtree.msdp.userservice.entity.UserData;
import com.mindtree.msdp.userservice.httpconfig.HttpConnection;

/**
 * @author M1018352
 * 
 */
public class UserService {

	private ResourceBundle bundle = ResourceBundle
			.getBundle("com.mindtree.msdp.userservice.rest.RestURL");
	private boolean outputValueFromRestService;

	/**
	 * Add user
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean addUser(UserData data) throws InvalidKeyException,
			NoSuchAlgorithmException, IOException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(bundle.getString("ADD_USER_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshalling(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * Add Anonymous User
	 * 
	 * @return
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */
	public boolean addAnonymousUser(UserData data) throws HttpException,
			IOException, InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(
				bundle.getString("ADD_ANONYMOUS_USER_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshalling(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * Add Tenant Admin User
	 * 
	 * @return
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean addTenantAdminUser(UserData data) throws HttpException,
			IOException, InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(
				bundle.getString("ADD_TENANT_ADMIN_USER_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshalling(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * update User
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */

	public boolean updateUser(UserData data) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(bundle.getString("UPDATE_USER_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshalling(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;
	}

	/**
	 * Get UserDetails By UserName
	 * 
	 * @throws Exception
	 */

	public String getUserDetailsByUserName(Integer tenantId, String userName,
			String productName) throws Exception {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("USER_DETAILS_BY_USERNAME_URL"), tenantId,
				urlEncode(userName), urlEncode(productName)));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * Get UserDetails By UserId
	 * 
	 * @throws Exception
	 */

	public String getUserDetailsByUserId(Integer tenantId, String userId,
			String productName) throws Exception {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("USER_DETAILS_BY_USERID_URL"), tenantId,
				urlEncode(userId), urlEncode(productName)));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * getAnonymousUsers
	 * 
	 * @throws Exception
	 */

	public String getAnonymousUsers(Integer tenantId, String productName)
			throws Exception {
		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_ANONYMOUS_USERS_URL"), tenantId,
				urlEncode(productName)));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * approveUser
	 * 
	 * @return
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */

	public boolean approveUser(UserData data) throws HttpException,
			IOException, InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(bundle.getString("APPROVE_USER_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshalling(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * Get Users
	 * 
	 * @throws Exception
	 */
	public String getUsers(Integer tenantId, String productName)
			throws Exception {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_USERS_URL"), tenantId,
				urlEncode(productName)));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * getStoredProcedureData
	 * 
	 * @throws Exception
	 */
	public String getStoredProcedureData(Integer tenantId, Integer pageNo,
			Integer noOfRecords) throws Exception {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_STORED_PROCEDURE_DATA"), tenantId,
				pageNo, noOfRecords));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * getGroupDetails
	 * 
	 * @throws Exception
	 */
	public String getGroupDetails(Integer tenantId, String groupCode,
			String productSlugName) throws Exception {
		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_GROUP_DETAILS_URL"), tenantId,
				urlEncode(groupCode), urlEncode(productSlugName)));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * getGroups
	 * 
	 * @throws Exception
	 */
	public String getGroups(Integer tenantId) throws Exception {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_GROUPS_URL"), tenantId));
		String xml = httpConnection.executeMethod(method);

		return xml;

	}

	/**
	 * DepartmentDetails
	 * 
	 * @throws Exception
	 */
	public String getDepartmentDetails(Integer tenantId, String departmentCode,
			String productSlugName) throws Exception {
		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_DEPARTMENT_DETAILS_URL"), tenantId,
				urlEncode(departmentCode), urlEncode(productSlugName)));
		String xml = httpConnection.executeMethod(method);

		return xml;
	}

	/**
	 * get Departments for tenant id
	 * 
	 * @throws Exception
	 */
	public String getDepartments(Integer tenantId) throws Exception {

		HttpConnection httpConnection = new HttpConnection();

		HttpMethod method = new GetMethod(String.format(
				bundle.getString("GET_DEPARTMENT__URL"), tenantId));

		String xml = httpConnection.executeMethod(method);

		return xml;
	}

	/**
	 * registerUser
	 */
	public boolean registerUser(String username, String password,
			String applicationName, String tenantSlugName)
			throws HttpException, IOException, InvalidKeyException,
			NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("REGISTER_USER_URL"), urlEncode(username),
				urlEncode(password), urlEncode(applicationName),
				urlEncode(tenantSlugName)));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * validateUser
	 * 
	 * @return
	 */
	public boolean validateUser(String username, String password,
			String applicationName, String tenantSlugName)
			throws HttpException, IOException, InvalidKeyException,
			NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("VALIDATE_USER_URL"), urlEncode(username),
				urlEncode(password), urlEncode(applicationName),
				urlEncode(tenantSlugName)));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * Add Group
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean addGroup(Group data) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(bundle.getString("ADD_GROUP_URL"));

		method.setRequestHeader("Content-Type", "Text/XML");
		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshallingGroup(data), "text/xml", "ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * updateGroup
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean updateGroup(Group data) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(bundle.getString("UPDATE_GROUP_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshallingGroup(data), "text/xml", "ISO-8859-1"));
		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * Add Department
	 * 
	 * @return
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean addDepartment(DepartmentData data) throws HttpException,
			IOException, InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(
				bundle.getString("ADD_DEPARTMENT_URL"));
		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshallingDepartmentData(data), "text/xml",
						"ISO-8859-1"));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;
	}

	/**
	 * Update Department
	 * 
	 * @throws HttpException
	 * @throws IOException
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 */
	public boolean updateDepartment(DepartmentData data) throws HttpException,
			IOException, InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(
				bundle.getString("UPDATE_DEPARTMENT_URL"));

		((EntityEnclosingMethod) method)
				.setRequestEntity(new StringRequestEntity(JAXBMarshall
						.marshallingDepartmentData(data), "text/xml",
						"ISO-8859-1"));
		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * deleteGroup
	 * 
	 * @return
	 */
	public boolean deleteGroup(Integer tenantId, String groupCode,
			String productSlugName) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("DELETE_GROUP_URL"), tenantId,
				urlEncode(groupCode), urlEncode(productSlugName)));
		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * deleteDepartment
	 * 
	 * @return
	 */
	public boolean deleteDepartment(Integer tenantId, String departmentCode,
			String productSlugName) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("DELETE_DEPARTMENT_URL"), tenantId,
				urlEncode(departmentCode), urlEncode(productSlugName)));

		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;
	}

	/**
	 * AssignUserToGroup
	 */
	public boolean assignUserToGroup(Integer tenantId, String userName,
			String groupCode) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("ASSIGN_USER_TO_GROUP_URL"), tenantId,
				urlEncode(userName), urlEncode(groupCode)));
		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	/**
	 * AssignUserToDepartment
	 */
	public boolean assignUserToDepartment(Integer tenantId, String userName,
			String departmentCode) throws HttpException, IOException,
			InvalidKeyException, NoSuchAlgorithmException {

		HttpConnection httpConnection = new HttpConnection();
		HttpMethod method = new PostMethod(String.format(
				bundle.getString("ASSIGN_USER_TO_DEPARTMENT_URL"), tenantId,
				urlEncode(userName), urlEncode(departmentCode)));
		String xml = httpConnection.executeMethod(method);

		outputValueFromRestService = httpConnection.getValue(xml);

		return outputValueFromRestService;

	}

	public String urlEncode(String parameter)
			throws UnsupportedEncodingException {

		String newParameter = URLEncoder.encode(parameter, "UTF-8");

		return newParameter;
	}

}
