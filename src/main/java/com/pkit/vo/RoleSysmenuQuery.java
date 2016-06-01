
package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;





public class RoleSysmenuQuery extends BaseQuery  {
    

	/** id */
	private Long id;
	/** roleId */
	private Long roleId;
	/** sysmenuId */
	private Long sysmenuId;

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long value) {
		this.id = value;
	}
    
	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setRoleId(Long value) {
		this.roleId = value;
	}
    
	public Long getSysmenuId() {
		return this.sysmenuId;
	}
	
	public void setSysmenuId(Long value) {
		this.sysmenuId = value;
	}
    

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

