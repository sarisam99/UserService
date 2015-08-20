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
@XmlRootElement(name="DepartmentData")
public class DepartmentData {

	private Integer tenantId;
	private String departmentId;
	private String departmentName;
	private String departmentDescription;
	private String tenantSlugName;
	private String productSlugName;
	private String departmentCode;
	
	/**
	 * 
	 */
	public DepartmentData() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentData(Integer tenantId, String departmentId,
			String departmentName, String departmentDescription,
			String tenantSlugName, String productSlugName, String departmentCode) {
		super();
		this.tenantId = tenantId;
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.tenantSlugName = tenantSlugName;
		this.productSlugName = productSlugName;
		this.departmentCode = departmentCode;
	}

	@XmlElement(name="TenantId")
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	@XmlElement(name="DepartmentId")
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	@XmlElement(name="DepartmentName")
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@XmlElement(name="DepartmentDescription")
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	@XmlElement(name="TenantSlugName")
	public void setTenantSlugName(String tenantSlugName) {
		this.tenantSlugName = tenantSlugName;
	}
	@XmlElement(name="ProductSlugName")
	public void setProductSlugName(String productSlugName) {
		this.productSlugName = productSlugName;
	}
	@XmlElement(name="DepartmentCode")
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public String getTenantSlugName() {
		return tenantSlugName;
	}

	public String getProductSlugName() {
		return productSlugName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	@Override
	public String toString() {
		return "DepartmentData [tenantId=" + tenantId + ", departmentId="
				+ departmentId + ", departmentName=" + departmentName
				+ ", departmentDescription=" + departmentDescription
				+ ", tenantSlugName=" + tenantSlugName + ", productSlugName="
				+ productSlugName + ", departmentCode=" + departmentCode + "]";
	}
	
	
	
	

	
}
