

package com.pkit.model;


import com.pkit.common.BaseEntity;
import com.pkit.util.DateConvertUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.text.ParseException;
import java.util.*;



public class Department extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "Department";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_PARENT_ID = "parentId";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_UPDATE_TIME = "updateTime";
	public static final String ALIAS_STATUS = "status";
	
	//date formats
	public static final String FORMAT_CREATE_TIME = DATE_TIME_FORMAT;
	public static final String FORMAT_UPDATE_TIME = DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private Long id;
    /**
     * name       db_column: name 
     */
	private String name;
    /**
     * parentId       db_column: parent_id 
     */	
	
	private Long parentId;
    /**
     * createTime       db_column: create_time 
     */	
	
	private Date createTime;
    /**
     * updateTime       db_column: update_time 
     */	
	
	private Date updateTime;
    /**
     * status       db_column: status 
     */	
	
	private Integer status;
	//columns END

  private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Department(){
	}

	public Department(
		Long id
	){
		this.id = id;
	}

	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
	
		
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	
		
	public void setParentId(Long value) {
		this.parentId = value;
	}
	
	public Long getParentId() {
		return this.parentId;
	}
	
	
		
	public String getCreateTimeString() {
		return DateConvertUtils.format(getCreateTime(), FORMAT_CREATE_TIME);
	}
	public void setCreateTimeString(String value) throws ParseException {
		setCreateTime(DateConvertUtils.parse(value, FORMAT_CREATE_TIME));
	}
	
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	
		
	public String getUpdateTimeString() {
		return DateConvertUtils.format(getUpdateTime(), FORMAT_UPDATE_TIME);
	}
	public void setUpdateTimeString(String value) throws ParseException{
		setUpdateTime(DateConvertUtils.parse(value, FORMAT_UPDATE_TIME));
	}
	
	public void setUpdateTime(Date value) {
		this.updateTime = value;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
	
	
		
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	
		
	
	private Set employees = new HashSet(0);
	public void setEmployees(Set<Employee> employee){
		this.employees = employee;
	}
	
	public Set<Employee> getEmployees() {
		return employees;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("ParentId",getParentId())
			.append("CreateTime",getCreateTime())
			.append("UpdateTime",getUpdateTime())
			.append("Status",getStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Department == false) return false;
		if(this == obj) return true;
		Department other = (Department)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

