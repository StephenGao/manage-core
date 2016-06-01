

package com.pkit.model;

import com.pkit.common.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;




public class RoleSysmenu extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "RoleSysmenu";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ROLE_ID = "roleId";
	public static final String ALIAS_SYSMENU_ID = "sysmenuId";
	
	//date formats

	//columns START
    /**
     * id       db_column: id 
     */	
	
	private Long id;
    /**
     * roleId       db_column: role_id 
     */	
	
	private Long roleId;
    /**
     * sysmenuId       db_column: sysmenu_id 
     */	
	
	private Long sysmenuId;
	//columns END

  private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public RoleSysmenu(){
	}

	public RoleSysmenu(
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
	
	
		
	public void setRoleId(Long value) {
		this.roleId = value;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	
	
		
	public void setSysmenuId(Long value) {
		this.sysmenuId = value;
	}
	
	public Long getSysmenuId() {
		return this.sysmenuId;
	}
	
	
		


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("RoleId",getRoleId())
			.append("SysmenuId",getSysmenuId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof RoleSysmenu == false) return false;
		if(this == obj) return true;
		RoleSysmenu other = (RoleSysmenu)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

