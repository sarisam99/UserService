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
@XmlRootElement(name="Group")
public class Group {

	private Integer tenantId ;
	private String groupId;
	private String groupName;
	private String groupDescription;
	private String tenantSlugName;
	private String productSlugName;
	private String groupCode;
	
	/**
	 * 
	 */
	public Group() {
		// TODO Auto-generated constructor stub
	}

	public Group(Integer tenantId, String groupId, String groupName,
			String groupDescription, String tenantSlugName,
			String productSlugName, String groupCode) {
		super();
		this.tenantId = tenantId;
		this.groupId = groupId;
		this.groupName = groupName;
		this.groupDescription = groupDescription;
		this.tenantSlugName = tenantSlugName;
		this.productSlugName = productSlugName;
		this.groupCode = groupCode;
	}

	@XmlElement(name="TenantId")
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	@XmlElement(name="GroupId")
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@XmlElement(name="GroupName")
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@XmlElement(name="GroupDescription")
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	@XmlElement(name="TenantSlugName")
	public void setTenantSlugName(String tenantSlugName) {
		this.tenantSlugName = tenantSlugName;
	}

	@XmlElement(name="ProductSlugName")
	public void setProductSlugName(String productSlugName) {
		this.productSlugName = productSlugName;
	}
	@XmlElement(name="GroupCode")
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public String getTenantSlugName() {
		return tenantSlugName;
	}

	public String getProductSlugName() {
		return productSlugName;
	}

	public String getGroupCode() {
		return groupCode;
	}

	@Override
	public String toString() {
		return "Group [tenantId=" + tenantId + ", groupId=" + groupId
				+ ", groupName=" + groupName + ", groupDescription="
				+ groupDescription + ", tenantSlugName=" + tenantSlugName
				+ ", productSlugName=" + productSlugName + ", groupCode="
				+ groupCode + "]";
	}
	
	
	

	

}
