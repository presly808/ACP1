package ua.artcode.week8.test;

import java.util.Date;

/**
 * Created by admin on 09.08.2014.
 */
public class DataContainer {

    private DataHandler dataHandler;
    private Long millis;

    private Date start;

    public DataContainer() {
    }

    public DataContainer(DataHandler dataHandler, Long millis, Date start) {
        this.dataHandler = dataHandler;
        this.millis = millis;
        this.start = start;
    }

    public DataHandler getDataHandler() {
        return dataHandler;
    }

    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public Long getMillis() {
        return millis;
    }

    public void setMillis(Long millis) {
        this.millis = millis;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }
}
