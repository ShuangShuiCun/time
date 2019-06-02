package cn.ljf.time.model;

import java.util.Date;

public class CalendarEvent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.CAL_ID
     *
     * @mbggenerated
     */
    private String calId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.URGENCY
     *
     * @mbggenerated
     */
    private String urgency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.START_TIME
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.END_TIME
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.PLACE
     *
     * @mbggenerated
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.CREATION_TIME
     *
     * @mbggenerated
     */
    private Date creationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CALENDAR.CAL_DETAILS
     *
     * @mbggenerated
     */
    private String calDetails;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.CAL_ID
     *
     * @return the value of TB_CALENDAR.CAL_ID
     *
     * @mbggenerated
     */
    public String getCalId() {
        return calId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.CAL_ID
     *
     * @param calId the value for TB_CALENDAR.CAL_ID
     *
     * @mbggenerated
     */
    public void setCalId(String calId) {
        this.calId = calId == null ? null : calId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.TITLE
     *
     * @return the value of TB_CALENDAR.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.TITLE
     *
     * @param title the value for TB_CALENDAR.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.URGENCY
     *
     * @return the value of TB_CALENDAR.URGENCY
     *
     * @mbggenerated
     */
    public String getUrgency() {
        return urgency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.URGENCY
     *
     * @param urgency the value for TB_CALENDAR.URGENCY
     *
     * @mbggenerated
     */
    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.START_TIME
     *
     * @return the value of TB_CALENDAR.START_TIME
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.START_TIME
     *
     * @param startTime the value for TB_CALENDAR.START_TIME
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.END_TIME
     *
     * @return the value of TB_CALENDAR.END_TIME
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.END_TIME
     *
     * @param endTime the value for TB_CALENDAR.END_TIME
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.PLACE
     *
     * @return the value of TB_CALENDAR.PLACE
     *
     * @mbggenerated
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.PLACE
     *
     * @param place the value for TB_CALENDAR.PLACE
     *
     * @mbggenerated
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.CREATION_TIME
     *
     * @return the value of TB_CALENDAR.CREATION_TIME
     *
     * @mbggenerated
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.CREATION_TIME
     *
     * @param creationTime the value for TB_CALENDAR.CREATION_TIME
     *
     * @mbggenerated
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CALENDAR.CAL_DETAILS
     *
     * @return the value of TB_CALENDAR.CAL_DETAILS
     *
     * @mbggenerated
     */
    public String getCalDetails() {
        return calDetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CALENDAR.CAL_DETAILS
     *
     * @param calDetails the value for TB_CALENDAR.CAL_DETAILS
     *
     * @mbggenerated
     */
    public void setCalDetails(String calDetails) {
        this.calDetails = calDetails == null ? null : calDetails.trim();
    }
}