
package com.pkit.model;


import com.pkit.common.BaseEntity;
import com.pkit.util.DateConvertUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.text.ParseException;
import java.util.*;





public class Sysmenu extends BaseEntity {
	
	//alias
	public static final String TABLE_ALIAS = "Sysmenu";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_NAVIGATE_URL = "navigateUrl";
	public static final String ALIAS_ICON = "icon";
	public static final String ALIAS_HOVER_ICON = "hoverIcon";
	public static final String ALIAS_EXPANDED_ICON = "չ";
	public static final String ALIAS_ACTIVE_ICON = "activeIcon";
	public static final String ALIAS_PARENT_ID = "parentId";
	public static final String ALIAS_SEQUENCE = "sequence";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_UPDATE_TIME = "updateTime";
	public static final String ALIAS_STATUS = "״̬";
	
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
     * navigateUrl       db_column: navigate_url 
     */
	private String navigateUrl;
    /**
     * icon       db_column: icon 
     */
	private String icon;
    /**
     * hoverIcon       db_column: hover_icon 
     */
	private String hoverIcon;
    /**
     * չ       db_column: expanded_icon 
     */
	private String expandedIcon;
    /**
     * activeIcon       db_column: active_icon 
     */
	private String activeIcon;
    /**
     * parentId       db_column: parent_id 
     */	
	
	private Long parentId;
    /**
     * sequence       db_column: sequence 
     */	
	
	private Integer sequence;
    /**
     * createTime       db_column: create_time 
     */	
	
	private Date createTime;
    /**
     * updateTime       db_column: update_time 
     */	
	
	private Date updateTime;
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

	public Sysmenu(){
	}

	public Sysmenu(
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
	
	
		
	public void setNavigateUrl(String value) {
		this.navigateUrl = value;
	}
	
	public String getNavigateUrl() {
		return this.navigateUrl;
	}
	
	
		
	public void setIcon(String value) {
		this.icon = value;
	}
	
	public String getIcon() {
		return this.icon;
	}
	
	
		
	public void setHoverIcon(String value) {
		this.hoverIcon = value;
	}
	
	public String getHoverIcon() {
		return this.hoverIcon;
	}
	
	
		
	public void setExpandedIcon(String value) {
		this.expandedIcon = value;
	}
	
	public String getExpandedIcon() {
		return this.expandedIcon;
	}
	
	
		
	public void setActiveIcon(String value) {
		this.activeIcon = value;
	}
	
	public String getActiveIcon() {
		return this.activeIcon;
	}
	
	
		
	public void setParentId(Long value) {
		this.parentId = value;
	}
	
	public Long getParentId() {
		return this.parentId;
	}
	
	
		
	public void setSequence(Integer value) {
		this.sequence = value;
	}
	
	public Integer getSequence() {
		return this.sequence;
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
	
	
		


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Name",getName())
			.append("NavigateUrl",getNavigateUrl())
			.append("Icon",getIcon())
			.append("HoverIcon",getHoverIcon())
			.append("ExpandedIcon",getExpandedIcon())
			.append("ActiveIcon",getActiveIcon())
			.append("ParentId",getParentId())
			.append("Sequence",getSequence())
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
		if(obj instanceof Sysmenu == false) return false;
		if(this == obj) return true;
		Sysmenu other = (Sysmenu)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

