package cn.beijing.ssfh.entity;

public class DayTime {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column day_time.day_time_id
     *
     * @mbggenerated
     */
    private Integer dayTimeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column day_time.time_range
     *
     * @mbggenerated
     */
    private String timeRange;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column day_time.day_time_id
     *
     * @return the value of day_time.day_time_id
     *
     * @mbggenerated
     */
    public Integer getDayTimeId() {
        return dayTimeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column day_time.day_time_id
     *
     * @param dayTimeId the value for day_time.day_time_id
     *
     * @mbggenerated
     */
    public void setDayTimeId(Integer dayTimeId) {
        this.dayTimeId = dayTimeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column day_time.time_range
     *
     * @return the value of day_time.time_range
     *
     * @mbggenerated
     */
    public String getTimeRange() {
        return timeRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column day_time.time_range
     *
     * @param timeRange the value for day_time.time_range
     *
     * @mbggenerated
     */
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange == null ? null : timeRange.trim();
    }
}