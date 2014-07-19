package week6.mysql.Warehouse;

import week6.mysql.Abstractions.AbstractElementWarehouse;
import week6.mysql.DeviceType.NotebookType;

import java.util.Date;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class ElementWarehouse extends AbstractElementWarehouse {

    public Date date;
    public int amount;

    public ElementWarehouse(String lotNumber, NotebookType notebookType, int price, Date date) {
        super(lotNumber, notebookType, price);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }
}
