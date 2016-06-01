

package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;





public class DepartmentQuery extends BaseQuery {
    

	/** id */
	private Long id;
	/** name */
	private String name;
	/** parentId */
	private Long parentId;
	/** createTime */
	private Date createTimeBegin;
	private Date createTimeEnd;
	/** updateTime */
	private Date updateTimeBegin;
	private Date updateTimeEnd;
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
    
	public Long getParentId() {
		return this.parentId;
	}
	
	public void setParentId(Long value) {
		this.parentId = value;
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

