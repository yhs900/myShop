package com.showtimer.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * The type Time util.
 *
 * @author shangzebei
 * @created $DateTime : 2016/8/22 10:59
 * @see [相关类/方法]
 */
public class TimeUtil {
    private static final Logger logger = LoggerFactory.getLogger(TimeUtil.class);


    /**
     * analysing the current time between the start time and the end time .
     *
     * @param start the start time string
     * @param end   the end time string
     * @return the boolean
     */
    public static boolean isInZoneMaintab(String start, String end) {
        Date starttime = null;
        Date endtime = null;
        starttime = getTime(start);
        endtime = getTime(end);
        return isInZone(starttime, endtime);


    }

    private static boolean isInZone(Date start, Date end) {
        Date date = new Date();

        if (date.after(start) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets time.
     *
     * @param text the text yyyy/MM/dd HH:mm format
     * @return the time
     */
    public static Date getTime(String text) {
        Date time = null;
        try {
            time = new SimpleDateFormat("yyyy/MM/dd HH:mm").parse(text);
        } catch (ParseException e) {
            logger.error(e.toString());
            return null;
        }
        return time;
    }

    /**
     * get current time
     * @param timeformat
     * @return
     */
    public static String getTimeNow(String timeformat) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(timeformat);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            String format = simpleDateFormat.format(new Date());
            return format;
    }


}
