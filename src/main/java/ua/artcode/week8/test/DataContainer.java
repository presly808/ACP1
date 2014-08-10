package ua.artcode.week8.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by admin on 09.08.2014.
 */
@Component// <bean id="dataContainer" class="ua.artcode.week8.test"/>
public class DataContainer {

    @Autowired
    private DataHandler dataHandler;

    private Long millis;

    @Autowired(required = false)
    @Qualifier(value = "d2")
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
