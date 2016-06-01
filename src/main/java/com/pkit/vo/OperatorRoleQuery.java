

package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;





public class OperatorRoleQuery extends BaseQuery  {
    

	/** id */
	private Long id;
	/** operatorId */
	private Long operatorId;
	/** roleId */
	private Long roleId;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
    
	public Long getOperatorId() {
		return this.operatorId;
	}
	
	public void setOperatorId(Long value) {
		this.operatorId = value;
	}
    
	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setRoleId(Long value) {
		this.roleId = value;
	}
    

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

