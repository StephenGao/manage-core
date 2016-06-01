

package com.pkit.model;


import com.pkit.common.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;




public class OperatorRole extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "OperatorRole";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_OPERATOR_ID = "operatorId";
	public static final String ALIAS_ROLE_ID = "roleId";
	
	//date formats

	//columns START
    /**
     * id       db_column: id 
     */	
	
	private Long id;
    /**
     * operatorId       db_column: operator_id 
     */	
	
	private Long operatorId;
    /**
     * roleId       db_column: role_id 
     */	
	
	private Long roleId;
	//columns END

  private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public OperatorRole(){
	}

	public OperatorRole(
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
	
	
		
	public void setOperatorId(Long value) {
		this.operatorId = value;
	}
	
	public Long getOperatorId() {
		return this.operatorId;
	}
	
	
		
	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	
	
		
	
	private Operator operator;
	
	public void setOperator(Operator operator){
		this.operator = operator;
	}
	
	public Operator getOperator() {
		return operator;
	}


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("OperatorId",getOperatorId())
			.append("RoleId",getRoleId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof OperatorRole == false) return false;
		if(this == obj) return true;
		OperatorRole other = (OperatorRole)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

