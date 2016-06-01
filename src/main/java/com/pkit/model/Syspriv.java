

package com.pkit.model;


import com.pkit.common.BaseEntity;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;






public class Syspriv extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "Syspriv";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_OBJ_NAME = "objName";
	public static final String ALIAS_OBJ_VALUE = "objValue";
	public static final String ALIAS_OP_NAME = "opName";
	public static final String ALIAS_OP_VALUE = "opValue";
	public static final String ALIAS_SYSMENU_ID = "sysmenuId";
	public static final String ALIAS_STATUS = "״̬";
	
	//date formats
	
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
     * objName       db_column: obj_name 
     */
	private String objName;
    /**
     * objValue       db_column: obj_value 
     */
	private String objValue;
    /**
     * opName       db_column: op_name 
     */
	private String opName;
    /**
     * opValue       db_column: op_value 
     */
	private String opValue;
    /**
     * sysmenuId       db_column: sysmenu_id 
     */	
	
	private Long sysmenuId;
    /**
     * ״̬       db_column: status 
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

	public Syspriv(){
	}

	public Syspriv(
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
	
	
		
	public void setObjName(String value) {
		this.objName = value;
	}
	
	public String getObjName() {
		return this.objName;
	}
	
	
		
	public void setObjValue(String value) {
		this.objValue = value;
	}
	
	public String getObjValue() {
		return this.objValue;
	}
	
	
		
	public void setOpName(String value) {
		this.opName = value;
	}
	
	public String getOpName() {
		return this.opName;
	}
	
	
		
	public void setOpValue(String value) {
		this.opValue = value;
	}
	
	public String getOpValue() {
		return this.opValue;
	}
	
	
		
	public void setSysmenuId(Long value) {
		this.sysmenuId = value;
	}
	
	public Long getSysmenuId() {
		return this.sysmenuId;
	}
	
	
		
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	
		


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("ObjName",getObjName())
			.append("ObjValue",getObjValue())
			.append("OpName",getOpName())
			.append("OpValue",getOpValue())
			.append("SysmenuId",getSysmenuId())
			.append("Status",getStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Syspriv == false) return false;
		if(this == obj) return true;
		Syspriv other = (Syspriv)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

