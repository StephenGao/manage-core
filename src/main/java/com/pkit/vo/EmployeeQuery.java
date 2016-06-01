
package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;



import java.util.*;



public class EmployeeQuery extends BaseQuery {

	/** id */
	private Long id;
	/** name */
	private String name;
	/** workNumber */
	private String workNumber;
	/** createTime */
	private Date createTimeBegin;
	private Date createTimeEnd;
	/** updateTime */
	private Date updateTimeBegin;
	private Date updateTimeEnd;
	/** operatorId */
	private Long operatorId;
	/** departmentId */
	private Long departmentId;
	/** status */
	private Integer status;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
    
	public String getName() {
		return this.name;
	}
	
	public void setName(String value) {
		this.name = value;
	}
    
	public String getWorkNumber() {
		return this.workNumber;
	}
	
	public void setWorkNumber(String value) {
		this.workNumber = value;
	}
    
	public Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	public void setCreateTimeBegin(Date value) {
		this.createTimeBegin = value;
	}	
	
	public Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	public void setCreateTimeEnd(Date value) {
		this.createTimeEnd = value;
	}
	
	public Date getUpdateTimeBegin() {
		return this.updateTimeBegin;
	}
	
	public void setUpdateTimeBegin(Date value) {
		this.updateTimeBegin = value;
	}	
	
	public Date getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}
	
	public void setUpdateTimeEnd(Date value) {
		this.updateTimeEnd = value;
	}
	
	public Long getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(Long value) {
		this.operatorId = value;
	}
    
	public Long getDepartmentId() {
		return this.departmentId;
	}
	
	public void setDepartmentId(Long value) {
		this.departmentId = value;
	}
    
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
    

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

