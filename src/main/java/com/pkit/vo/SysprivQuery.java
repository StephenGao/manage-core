

package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;




public class SysprivQuery extends BaseQuery{
    

	/** id */
	private Long id;
	/** name */
	private String name;
	/** objName */
	private String objName;
	/** objValue */
	private String objValue;
	/** opName */
	private String opName;
	/** opValue */
	private String opValue;
	/** sysmenuId */
	private Long sysmenuId;
	/** ״̬ */
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
    
	public String getObjName() {
		return this.objName;
	}
	
	public void setObjName(String value) {
		this.objName = value;
	}
    
	public String getObjValue() {
		return this.objValue;
	}
	
	public void setObjValue(String value) {
		this.objValue = value;
	}
    
	public String getOpName() {
		return this.opName;
	}
	
	public void setOpName(String value) {
		this.opName = value;
	}
    
	public String getOpValue() {
		return this.opValue;
	}
	
	public void setOpValue(String value) {
		this.opValue = value;
	}
    
	public Long getSysmenuId() {
		return this.sysmenuId;
	}
	
	public void setSysmenuId(Long value) {
		this.sysmenuId = value;
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

