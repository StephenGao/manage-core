

package com.pkit.model;


import com.pkit.common.BaseEntity;
import com.pkit.util.DateConvertUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.text.ParseException;
import java.util.*;





public class Employee extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "Employee";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_WORK_NUMBER = "workNumber";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_UPDATE_TIME = "updateTime";
	public static final String ALIAS_OPERATOR_ID = "operatorId";
	public static final String ALIAS_DEPARTMENT_ID = "departmentId";
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
     * workNumber       db_column: work_number 
     */
	private String workNumber;
    /**
     * createTime       db_column: create_time 
     */	
	
	private Date createTime;
    /**
     * updateTime       db_column: update_time 
     */	
	
	private Date updateTime;
    /**
     * operatorId       db_column: operator_id 
     */	
	
	private Long operatorId;
    /**
     * departmentId       db_column: department_id 
     */	
	
	private Long departmentId;
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

	public Employee(){
	}

	public Employee(
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
	
	
		
	public void setWorkNumber(String value) {
		this.workNumber = value;
	}
	
	public String getWorkNumber() {
		return this.workNumber;
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
	
	
		
	public void setOperatorId(Long value) {
		this.operatorId = value;
	}
	
	public Long getOperatorId() {
		return this.operatorId;
	}
	
	
		
	public void setDepartmentId(Long value) {
		this.departmentId = value;
	}
	
	public Long getDepartmentId() {
		return this.departmentId;
	}
	
	
		
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	
		
	
	private Operator operator;
	
	public void setOperator(Operator operator){
		this.operator = operator;
	}
	
	public Operator getOperator() {
		return operator;
	}
	
	private Department department;
	
	public void setDepartment(Department department){
		this.department = department;
	}
	
	public Department getDepartment() {
		return department;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("WorkNumber",getWorkNumber())
			.append("CreateTime",getCreateTime())
			.append("UpdateTime",getUpdateTime())
			.append("OperatorId",getOperatorId())
			.append("DepartmentId",getDepartmentId())
			.append("Status",getStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Employee == false) return false;
		if(this == obj) return true;
		Employee other = (Employee)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

