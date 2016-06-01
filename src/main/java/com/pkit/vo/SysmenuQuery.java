

package com.pkit.vo;

import com.pkit.common.BaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;


public class SysmenuQuery extends BaseQuery {
    

	/** id */
	private Long id;
	/** name */
	private String name;
	/** navigateUrl */
	private String navigateUrl;
	/** icon */
	private String icon;
	/** hoverIcon */
	private String hoverIcon;
	/** չ */
	private String expandedIcon;
	/** activeIcon */
	private String activeIcon;
	/** parentId */
	private Long parentId;
	/** sequence */
	private Integer sequence;
	/** createTime */
	private Date createTimeBegin;
	private Date createTimeEnd;
	/** updateTime */
	private Date updateTimeBegin;
	private Date updateTimeEnd;
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
    
	public String getNavigateUrl() {
		return this.navigateUrl;
	}
	
	public void setNavigateUrl(String value) {
		this.navigateUrl = value;
	}
    
	public String getIcon() {
		return this.icon;
	}
	
	public void setIcon(String value) {
		this.icon = value;
	}
    
	public String getHoverIcon() {
		return this.hoverIcon;
	}
	
	public void setHoverIcon(String value) {
		this.hoverIcon = value;
	}
    
	public String getExpandedIcon() {
		return this.expandedIcon;
	}
	
	public void setExpandedIcon(String value) {
		this.expandedIcon = value;
	}
    
	public String getActiveIcon() {
		return this.activeIcon;
	}
	
	public void setActiveIcon(String value) {
		this.activeIcon = value;
	}
    
	public Long getParentId() {
		return this.parentId;
	}
	
	public void setParentId(Long value) {
		this.parentId = value;
	}
    
	public Integer getSequence() {
		return this.sequence;
	}
	
	public void setSequence(Integer value) {
		this.sequence = value;
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

