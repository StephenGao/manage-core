
package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;




public class OperatorQuery extends BaseQuery {
    

	/** id */
	private Long id;
	/** loginName */
	private String loginName;
	/** password */
	private String password;
	/** realName */
	private String realName;
	/** gender */
	private String gender;
	/** age */
	private Integer age;
	/** email */
	private String email;
	/** telephone */
	private String telephone;
	/** operatorType */
	private Integer operatorType;
	/** createTime */
	private Date createTimeBegin;
	private Date createTimeEnd;
	/** updateTime */
	private Date updateTimeBegin;
	private Date updateTimeEnd;
	/** loginTime */
	private Date loginTimeBegin;
	private Date loginTimeEnd;
	/** loginIp */
	private String loginIp;
	/** errorCount */
	private Integer errorCount;
	/** ״̬ */
	private Integer status;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
    
	public String getLoginName() {
		return this.loginName;
	}
	
	public void setLoginName(String value) {
		this.loginName = value;
	}
    
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
    
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String value) {
		this.realName = value;
	}
    
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String value) {
		this.gender = value;
	}
    
	public Integer getAge() {
		return this.age;
	}
	
	public void setAge(Integer value) {
		this.age = value;
	}
    
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
    
	public String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(String value) {
		this.telephone = value;
	}
    
	public Integer getOperatorType() {
		return this.operatorType;
	}
	
	public void setOperatorType(Integer value) {
		this.operatorType = value;
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
	
	public Date getLoginTimeBegin() {
		return this.loginTimeBegin;
	}
	
	public void setLoginTimeBegin(Date value) {
		this.loginTimeBegin = value;
	}	
	
	public Date getLoginTimeEnd() {
		return this.loginTimeEnd;
	}
	
	public void setLoginTimeEnd(Date value) {
		this.loginTimeEnd = value;
	}
	
	public String getLoginIp() {
		return this.loginIp;
	}
	
	public void setLoginIp(String value) {
		this.loginIp = value;
	}
    
	public Integer getErrorCount() {
		return this.errorCount;
	}
	
	public void setErrorCount(Integer value) {
		this.errorCount = value;
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

