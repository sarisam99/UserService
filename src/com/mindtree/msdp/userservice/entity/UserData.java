/**

 * 
 */
 
package com.mindtree.msdp.userservice.entity;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author M1018352
 *
 */
@XmlRootElement(name="UserData")

public class UserData {

	
	private String Comment;
	private String CreatedBy;
	private String CreatedOn;
	private String Email;
	private String Expiry;
	private String FirstName;
	private boolean IsAnonymous;
	private String LastName;
	private String ModifiedBy;
	private String ModifiedOn;
	private Integer Phone;
	private String ProductSlugName;
	private Integer TenantId;
	private String UserId;
	private String UserName;
	private Integer UserRoleId;
	private String UserRoleName;
	private Integer UserStatus;
	
	/**
	 * 
	 */
	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public UserData(String comment, String createdBy, String createdOn,
			String email, String expiry, String firstName, boolean isAnonymous,
			String lastName, String modifiedBy, String modifiedOn,
			Integer phone, String productSlugName, Integer tenantId,
			String userId, String userName, Integer userRoleId,
			String userRoleName, Integer userStatus) {
		super();
		Comment = comment;
		CreatedBy = createdBy;
		CreatedOn = createdOn;
		Email = email;
		Expiry = expiry;
		FirstName = firstName;
		IsAnonymous = isAnonymous;
		LastName = lastName;
		ModifiedBy = modifiedBy;
		ModifiedOn = modifiedOn;
		Phone = phone;
		ProductSlugName = productSlugName;
		TenantId = tenantId;
		UserId = userId;
		UserName = userName;
		UserRoleId = userRoleId;
		UserRoleName = userRoleName;
		UserStatus = userStatus;
	}

	@XmlElement(name="Comment")
	public void setComment(String comment) {
		Comment = comment;
	}

	@XmlElement(name="CreatedBy")
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	@XmlElement(name="CreatedOn")
	public void setCreatedOn(String createdOn) {
		CreatedOn = createdOn;
	}

	@XmlElement(name="Email")
	public void setEmail(String email) {
		Email = email;
	}

	@XmlElement(name="Expiry")
	public void setExpiry(String expiry) {
		Expiry = expiry;
	}

	@XmlElement(name="FirstName")
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	@XmlElement(name="IsAnonymous")
	public void setIsAnonymous(boolean isAnonymous) {
		IsAnonymous = isAnonymous;
	}

	@XmlElement(name="LastName")
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@XmlElement(name="ModifiedBy")
	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	@XmlElement(name="ModifiedOn")
	public void setModifiedOn(String modifiedOn) {
		ModifiedOn = modifiedOn;
	}

	@XmlElement(name="Phone")
	public void setPhone(Integer phone) {
		Phone = phone;
	}

	@XmlElement(name="ProductSlugName")
	public void setProductSlugName(String productSlugName) {
		ProductSlugName = productSlugName;
	}

	@XmlElement(name="TenantId")
	public void setTenantId(Integer tenantId) {
		TenantId = tenantId;
	}

	@XmlElement(name="UserId")
	public void setUserId(String userId) {
		UserId = userId;
	}

	@XmlElement(name="UserName")
	public void setUserName(String userName) {
		UserName = userName;
	}

	@XmlElement(name="UserRoleId")
	public void setUserRoleId(Integer userRoleId) {
		UserRoleId = userRoleId;
	}

	@XmlElement(name="UserRoleName")
	public void setUserRoleName(String userRoleName) {
		UserRoleName = userRoleName;
	}

	@XmlElement(name="UserStatus")
	public void setUserStatus(Integer userStatus) {
		UserStatus = userStatus;
	}

	
	public String getComment() {
		return Comment;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public String getCreatedOn() {
		return CreatedOn;
	}

	public String getEmail() {
		return Email;
	}

	public String getExpiry() {
		return Expiry;
	}

	public String getFirstName() {
		return FirstName;
	}

	public boolean isIsAnonymous() {
		return IsAnonymous;
	}

	public String getLastName() {
		return LastName;
	}

	public String getModifiedBy() {
		return ModifiedBy;
	}

	public String getModifiedOn() {
		return ModifiedOn;
	}

	public Integer getPhone() {
		return Phone;
	}

	public String getProductSlugName() {
		return ProductSlugName;
	}

	public Integer getTenantId() {
		return TenantId;
	}

	public String getUserId() {
		return UserId;
	}

	public String getUserName() {
		return UserName;
	}

	public Integer getUserRoleId() {
		return UserRoleId;
	}

	public String getUserRoleName() {
		return UserRoleName;
	}

	public Integer getUserStatus() {
		return UserStatus;
	}

	@Override
	public String toString() {
		return "UserData [Comment=" + Comment + ", CreatedBy=" + CreatedBy
				+ ", CreatedOn=" + CreatedOn + ", Email=" + Email + ", Expiry="
				+ Expiry + ", FirstName=" + FirstName + ", IsAnonymous="
				+ IsAnonymous + ", LastName=" + LastName + ", ModifiedBy="
				+ ModifiedBy + ", ModifiedOn=" + ModifiedOn + ", Phone="
				+ Phone + ", ProductSlugName=" + ProductSlugName
				+ ", TenantId=" + TenantId + ", UserId=" + UserId
				+ ", UserName=" + UserName + ", UserRoleId=" + UserRoleId
				+ ", UserRoleName=" + UserRoleName + ", UserStatus="
				+ UserStatus + "]";
	}

	
	
	

}
