package com.pkit.model;

import com.pkit.common.BaseEntity;
import com.pkit.util.DateConvertUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.text.ParseException;
import java.util.*;



public class Operator extends BaseEntity {
    //alias
    public static final String TABLE_ALIAS = "Operator";
    public static final String ALIAS_ID = "id";
    public static final String ALIAS_LOGIN_NAME = "loginName";
    public static final String ALIAS_PASSWORD = "password";
    public static final String ALIAS_REAL_NAME = "realName";
    public static final String ALIAS_GENDER = "gender";
    public static final String ALIAS_AGE = "age";
    public static final String ALIAS_EMAIL = "email";
    public static final String ALIAS_TELEPHONE = "telephone";
    public static final String ALIAS_OPERATOR_TYPE = "operatorType";
    public static final String ALIAS_CREATE_TIME = "createTime";
    public static final String ALIAS_UPDATE_TIME = "updateTime";
    public static final String ALIAS_LOGIN_TIME = "loginTime";
    public static final String ALIAS_LOGIN_IP = "loginIp";
    public static final String ALIAS_ERROR_COUNT = "errorCount";
    public static final String ALIAS_STATUS = "״̬";

    //date formats
    public static final String FORMAT_CREATE_TIME = DATE_TIME_FORMAT;
    public static final String FORMAT_UPDATE_TIME = DATE_TIME_FORMAT;
    public static final String FORMAT_LOGIN_TIME = DATE_TIME_FORMAT;

    //columns START
    /**
     * id       db_column: id
     */

    private Long id;
    /**
     * loginName       db_column: login_name
     */
    private String loginName;
    /**
     * password       db_column: password
     */
    private String password;
    /**
     * realName       db_column: real_name
     */
    private String realName;
    /**
     * gender       db_column: gender
     */
    private String gender;
    /**
     * age       db_column: age
     */

    private Integer age;
    /**
     * email       db_column: email
     */
    private String email;
    /**
     * telephone       db_column: telephone
     */
    private String telephone;
    /**
     * operatorType       db_column: operator_type
     */

    private Integer operatorType;
    /**
     * createTime       db_column: create_time
     */

    private Date createTime;
    /**
     * updateTime       db_column: update_time
     */

    private Date updateTime;
    /**
     * loginTime       db_column: login_time
     */

    private Date loginTime;
    /**
     * loginIp       db_column: login_ip
     */
    private String loginIp;
    /**
     * errorCount       db_column: error_count
     */

    private Integer errorCount;
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

    public Operator() {
    }

    public Operator(
            Long id
    ) {
        this.id = id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public Long getId() {
        return this.id;
    }


    public void setLoginName(String value) {
        this.loginName = value;
    }

    public String getLoginName() {
        return this.loginName;
    }


    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return this.password;
    }


    public void setRealName(String value) {
        this.realName = value;
    }

    public String getRealName() {
        return this.realName;
    }


    public void setGender(String value) {
        this.gender = value;
    }

    public String getGender() {
        return this.gender;
    }


    public void setAge(Integer value) {
        this.age = value;
    }

    public Integer getAge() {
        return this.age;
    }


    public void setEmail(String value) {
        this.email = value;
    }

    public String getEmail() {
        return this.email;
    }


    public void setTelephone(String value) {
        this.telephone = value;
    }

    public String getTelephone() {
        return this.telephone;
    }


    public void setOperatorType(Integer value) {
        this.operatorType = value;
    }

    public Integer getOperatorType() {
        return this.operatorType;
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


    public String getLoginTimeString() {
        return DateConvertUtils.format(getLoginTime(), FORMAT_LOGIN_TIME);
    }

    public void setLoginTimeString(String value)  throws ParseException{
        setLoginTime(DateConvertUtils.parse(value, FORMAT_LOGIN_TIME));
    }

    public void setLoginTime(Date value) {
        this.loginTime = value;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }


    public void setLoginIp(String value) {
        this.loginIp = value;
    }

    public String getLoginIp() {
        return this.loginIp;
    }


    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    public Integer getErrorCount() {
        return this.errorCount;
    }


    public void setStatus(Integer value) {
        this.status = value;
    }

    public Integer getStatus() {
        return this.status;
    }


    private Set employees = new HashSet(0);
    public void setEmployees(Set<Employee> employee) {
        this.employees = employee;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    private Set operatorRoles = new HashSet(0);

    public void setOperatorRoles(Set<OperatorRole> operatorRole) {
        this.operatorRoles = operatorRole;
    }

    public Set<OperatorRole> getOperatorRoles() {
        return operatorRoles;
    }


    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("Id", getId())
                .append("LoginName", getLoginName())
                .append("Password", getPassword())
                .append("RealName", getRealName())
                .append("Gender", getGender())
                .append("Age", getAge())
                .append("Email", getEmail())
                .append("Telephone", getTelephone())
                .append("OperatorType", getOperatorType())
                .append("CreateTime", getCreateTime())
                .append("UpdateTime", getUpdateTime())
                .append("LoginTime", getLoginTime())
                .append("LoginIp", getLoginIp())
                .append("ErrorCount", getErrorCount())
                .append("Status", getStatus())
                .toString();
    }

    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Operator == false) return false;
        if (this == obj) return true;
        Operator other = (Operator) obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}

