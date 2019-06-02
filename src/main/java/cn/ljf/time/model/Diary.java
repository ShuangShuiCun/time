package cn.ljf.time.model;

import java.util.Date;

public class Diary {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_DIARY.DIARY_ID
     *
     * @mbggenerated
     */
    private String diaryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_DIARY.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_DIARY.NOW_DATE
     *
     * @mbggenerated
     */
    private Date nowDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_DIARY.WEATHER
     *
     * @mbggenerated
     */
    private String weather;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_DIARY.DIARY_CONTENT
     *
     * @mbggenerated
     */
    private String diaryContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_DIARY.DIARY_ID
     *
     * @return the value of TB_DIARY.DIARY_ID
     *
     * @mbggenerated
     */
    public String getDiaryId() {
        return diaryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_DIARY.DIARY_ID
     *
     * @param diaryId the value for TB_DIARY.DIARY_ID
     *
     * @mbggenerated
     */
    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId == null ? null : diaryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_DIARY.TITLE
     *
     * @return the value of TB_DIARY.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_DIARY.TITLE
     *
     * @param title the value for TB_DIARY.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_DIARY.NOW_DATE
     *
     * @return the value of TB_DIARY.NOW_DATE
     *
     * @mbggenerated
     */
    public Date getNowDate() {
        return nowDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_DIARY.NOW_DATE
     *
     * @param nowDate the value for TB_DIARY.NOW_DATE
     *
     * @mbggenerated
     */
    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_DIARY.WEATHER
     *
     * @return the value of TB_DIARY.WEATHER
     *
     * @mbggenerated
     */
    public String getWeather() {
        return weather;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_DIARY.WEATHER
     *
     * @param weather the value for TB_DIARY.WEATHER
     *
     * @mbggenerated
     */
    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_DIARY.DIARY_CONTENT
     *
     * @return the value of TB_DIARY.DIARY_CONTENT
     *
     * @mbggenerated
     */
    public String getDiaryContent() {
        return diaryContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_DIARY.DIARY_CONTENT
     *
     * @param diaryContent the value for TB_DIARY.DIARY_CONTENT
     *
     * @mbggenerated
     */
    public void setDiaryContent(String diaryContent) {
        this.diaryContent = diaryContent == null ? null : diaryContent.trim();
    }
}