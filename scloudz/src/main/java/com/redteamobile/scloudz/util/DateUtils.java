package com.redteamobile.scloudz.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Remark: 默认系统时区为"GMT"
 */
public class DateUtils {
    public static final FastDateFormat ISO_DATETIME_FORMAT = FastDateFormat.getInstance(Patterns.DATE_TIME);
    public static final String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_CARD_TIME_FORMAT = "ssmmHHddMMyy";

    // Protect constructor since it is a static only class
    protected DateUtils() {
    }

    /**
     * 生成某天零时的日期对象 例如：若输入时间为（2004-08-01 11:30:58），将获得（2004-08-01 00:00:00）的日期对象
     *
     * @return Date java.util.Date对象
     * @Param dt 待宰的羔羊
     */
    public static Date getRoundedDay(Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        return new GregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH))
                .getTime();
    }

    /**
     * 生成今天零时的日期对象 例如：若当前时间为（2004-08-01 11:30:58），将获得（2004-08-01 00:00:00）的日期对象
     *
     * @return Date java.util.Date对象
     */
    public static Date today() {
        return getRoundedDay(new Date());
    }

    /**
     * 生成今天16时的日期对象 例如：若当前时间为（2004-08-01 11:30:58），将获得（2004-08-01 16:00:00）的日期对象
     *
     * @return Date java.util.Date对象
     */
    public static Date sixteenOfToday() {
        return org.apache.commons.lang3.time.DateUtils.addHours(today(), 16);
    }

    /**
     * String + pattern => Date
     *
     * @param date    ...
     * @param pattern 参考Patterns内部类
     * @return ...
     * @throws IllegalArgumentException null date或null pattern
     * @throws ParseException           date不匹配pattern
     */
    public static Date parse(String date, String pattern) throws ParseException {
        return org.apache.commons.lang3.time.DateUtils.parseDate(date, pattern);
    }

    /**
     * String => Date， 默认pattern是"yyyy-MM-dd HH:mm:ss"
     *
     * @param date ...
     * @return ...
     * @throws IllegalArgumentException null date或null pattern
     * @throws ParseException           date不匹配pattern
     */
    public static Date parse(String date) throws ParseException {
        return parse(date, Patterns.DATE_TIME);
    }

    public static Date parseFromCST(String date, String pattern) throws ParseException {
        return org.apache.commons.lang3.time.DateUtils.addHours(parse(date, pattern), -8);
    }

    public static Date parseFromCST(String date) throws ParseException {
        return parseFromCST(date, Patterns.DATE_TIME);
    }

    /**
     * Date + pattern => String
     *
     * @param date    ...
     * @param pattern 参考Patterns内部类
     * @return null 如果date为null
     */
    public static String format(Date date, String pattern) {
        if (date == null) {
            return null;
        }
        return DateFormatUtils.format(date, pattern);
    }

    /**
     * Date => String, 默认返回的时间格式为"yyyy-MM-dd HH:mm:ss"
     *
     * @param date ...
     * @return null 如果date为null
     */
    public static String format(Date date) {
        return DateFormatUtils.format(date, Patterns.DATE_TIME);
    }

    public static String formatToCST(Date date, String pattern) {
        return format(org.apache.commons.lang3.time.DateUtils.addHours(date, 8), pattern);
    }

    public static String formatToCST(Date date) {
        return formatToCST(date, Patterns.DATE_TIME);
    }

    public static Date addDays(Date date, int amount) {
        return org.apache.commons.lang3.time.DateUtils.addDays(date, amount);
    }

    public static Date addHours(Date date, int amount) {
        return org.apache.commons.lang3.time.DateUtils.addHours(date, amount);
    }

//    public static void main(String[] args) {
//        try {
//            String t = "170228140000";
//            System.out.println(DateTime.parse(t, DateTimeFormat.forPattern("yyMMddHHmmss").withZone(DateTimeZone.UTC)).plus(86400000).toString("yyMMddHHmmss"));
//            System.out.println(DateTime.parse(t, DateTimeFormat.forPattern("yyMMddHHmmss").withZone(DateTimeZone.forOffsetHours(8))).plus(86400000).toString("yyMMddHHmmss"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 计算套餐订单结束时间
     * @param startTime
     * @param count
     * @param fixTime
     * @return
     */
    public static Date setEndTime(Date startTime , int count ,int fixTime) {
        return org.apache.commons.lang3.time.DateUtils.addHours(startTime, count*24+fixTime);
    }

    /**
     * 计算资源回收时间
     * @param startTime
     * @param count
     * @param keepTime
     * @param fixTime
     * @return
     */
    public static Date setRecyleTime(Date startTime , int count ,int keepTime ,int fixTime ) {
        return org.apache.commons.lang3.time.DateUtils.addHours(startTime, count*24+keepTime+fixTime);
    }


    public static Date getPlusTime(Date startTime , int hourses ) {
        return org.apache.commons.lang3.time.DateUtils.addHours(startTime, hourses);
    }


    /*=======================================分割线，Date类型请往上，DateTime类型请往下===============================================*/

    public static DateTime parseDateFromString(final String time) {
        return DateTime.parse(time, DateTimeFormat.forPattern(DEFAULT_DATE_FORMAT));
    }

    public static DateTime parseTimeFromString(final String time) {
        return DateTime.parse(time, DateTimeFormat.forPattern(DEFAULT_TIME_FORMAT));
    }

    public static DateTime parseCardTimeFromString(final String time) {
        return DateTime.parse(new StringBuilder(time).reverse().toString(), DateTimeFormat.forPattern(DEFAULT_CARD_TIME_FORMAT));
    }

    public static String formatDateToCardTime(DateTime date) {
        return new StringBuilder(date.toString(DEFAULT_CARD_TIME_FORMAT)).reverse().toString();
    }

    public static long delta(Date start, Date end) {
        return Math.abs(end.getTime() - start.getTime());
    }

    public static DateTime parseFromString(final String time, final String pattern) {
        return DateTime.parse(time, DateTimeFormat.forPattern(pattern));
    }

    public static String getDateFormat(final DateTime dateTime, final String pattern) {
        return dateTime.toString(pattern);
    }

    public static DateTime getNowHour() {
        DateTime n = DateTime.now(DateTimeZone.UTC);
        return n.minuteOfHour().setCopy(0).secondOfMinute().setCopy(0).millisOfSecond().setCopy(0);
    }

    /*
     * Use Joda time library to get current time and always return UTC time
     */
    public static DateTime getCurrentDateTime() {
        DateTime dt = new DateTime(new Date());
        return dt.toDateTime(DateTimeZone.UTC);
    }

    public static DateTime getDateTime(Date date) {
        DateTime dt = new DateTime(date);
        return dt.toDateTime(DateTimeZone.UTC);
    }

    public static DateTime getDateTime(long timestamp) {
        DateTime dt = new DateTime(timestamp);
        return dt.toDateTime(DateTimeZone.UTC);
    }

    // Date passed in must be UTC time
    public static Long getMillis(final Date date) {
        if (date == null) {
            return -1L;
        }
        return getDateTime(date).getMillis();
    }

    /*
     * translate the string time format to DateTime
     */
    public static DateTime getDateTimeInUTC(final String date, String pattern) {
        return DateTime.parse(date, DateTimeFormat.forPattern(pattern));
    }

    public static DateTime getDateTimeInGMT8(final String date, String pattern) {
        return UTCtoGMT8(getDateTimeInUTC(date, pattern));
    }

    public static String getDateFormat(final DateTime dateTime) {
        return dateTime.toString("yyyy-MM-dd HH:mm:ss");
    }

    public static DateTime UTCtoGMT8(final DateTime dateTime) {
        DateTime dt = dateTime.withZone(DateTimeZone.forID("Etc/GMT-8"));
        return dt;
    }

    public static DateTime UTCtoGMT8(final Date date) {
        DateTime dt = new DateTime(date.getTime(), DateTimeZone.UTC);
        return UTCtoGMT8(dt);
    }

    public static DateTime GMT8toUTC(final DateTime dateTime) {
        return dateTime.withZone(DateTimeZone.forID("Etc/GMT"));
    }

    public static DateTime GMT8toUTC(final Date date) {
        DateTime dt = new DateTime(date).toDateTime(DateTimeZone.forID("Etc/GMT-8"));
        return GMT8toUTC(dt);
    }

    public static DateTime UTCtoCET(final DateTime dateTime) {
        DateTime dt = dateTime.withZone(DateTimeZone.forID("CET"));
        return dt;
    }

    public static DateTime getMidNightInGMT8() {
        DateTime current = getCurrentDateTime();
        current = UTCtoGMT8(current);
        int hours = current.getHourOfDay();
        int minutes = current.getMinuteOfHour();
        int seconds = current.getSecondOfMinute();
        return current.minusHours(hours).minusMinutes(minutes).minusSeconds(seconds);
    }

    public static DateTime calculateOrderEndTime(DateTime startTime, int count, int duration) {
        return startTime.plusDays(count * duration);
    }

    public static DateTime calculateSimcardExpireTime(DateTime startTime, int duration) {
        return startTime.plusDays(duration);
    }

    public static DateTime calculateTimeBefore(DateTime startTime, int duration) {
        return startTime.minusDays(duration);
    }

    public static class Patterns {
        public static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";
        public static final String DATE = "yyyy-MM-dd";
    }
}
