package com.study.domain;

public class Opencount {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.projectId
     *
     * @mbggenerated
     */
    private String projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.openCount
     *
     * @mbggenerated
     */
    private Integer opencount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.registiterTime
     *
     * @mbggenerated
     */
    private String registitertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column opencount.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.id
     *
     * @return the value of opencount.id
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.id
     *
     * @param id the value for opencount.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.projectId
     *
     * @return the value of opencount.projectId
     * @mbggenerated
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.projectId
     *
     * @param projectid the value for opencount.projectId
     * @mbggenerated
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid == null ? null : projectid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.openCount
     *
     * @return the value of opencount.openCount
     * @mbggenerated
     */
    public Integer getOpencount() {
        return opencount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.openCount
     *
     * @param opencount the value for opencount.openCount
     * @mbggenerated
     */
    public void setOpencount(Integer opencount) {
        this.opencount = opencount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.city
     *
     * @return the value of opencount.city
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.city
     *
     * @param city the value for opencount.city
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.registiterTime
     *
     * @return the value of opencount.registiterTime
     * @mbggenerated
     */
    public String getRegistitertime() {
        return registitertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.registiterTime
     *
     * @param registitertime the value for opencount.registiterTime
     * @mbggenerated
     */
    public void setRegistitertime(String registitertime) {
        this.registitertime = registitertime == null ? null : registitertime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column opencount.remark
     *
     * @return the value of opencount.remark
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column opencount.remark
     *
     * @param remark the value for opencount.remark
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}