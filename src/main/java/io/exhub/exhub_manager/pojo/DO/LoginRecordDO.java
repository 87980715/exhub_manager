package io.exhub.exhub_manager.pojo.DO;

import java.util.Date;

/**
 * 交易中心登录记录
 * @date 2018/7/26
 * @author
 */
public class LoginRecordDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.user_id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.login_way
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Integer loginWay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.login_ip
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private String loginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.status
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.message
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.create_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_login_record.update_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.id
     *
     * @return the value of t_login_record.id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.id
     *
     * @param id the value for t_login_record.id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.user_id
     *
     * @return the value of t_login_record.user_id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.user_id
     *
     * @param userId the value for t_login_record.user_id
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.login_way
     *
     * @return the value of t_login_record.login_way
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Integer getLoginWay() {
        return loginWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.login_way
     *
     * @param loginWay the value for t_login_record.login_way
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setLoginWay(Integer loginWay) {
        this.loginWay = loginWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.login_ip
     *
     * @return the value of t_login_record.login_ip
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.login_ip
     *
     * @param loginIp the value for t_login_record.login_ip
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.status
     *
     * @return the value of t_login_record.status
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.status
     *
     * @param status the value for t_login_record.status
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.message
     *
     * @return the value of t_login_record.message
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.message
     *
     * @param message the value for t_login_record.message
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.create_time
     *
     * @return the value of t_login_record.create_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.create_time
     *
     * @param createTime the value for t_login_record.create_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_login_record.update_time
     *
     * @return the value of t_login_record.update_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_login_record.update_time
     *
     * @param updateTime the value for t_login_record.update_time
     *
     * @mbg.generated Fri Jul 20 10:31:01 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "LoginRecordDO{" +
                "id=" + id +
                ", userId=" + userId +
                ", loginWay=" + loginWay +
                ", loginIp='" + loginIp + '\'' +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}