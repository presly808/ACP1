package week6.mysql.Abstractions;

import week6.mysql.DeviceType.NotebookType;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class AbstractElementWarehouse {

    public String lotNumber;
    public NotebookType notebookType;
    public int price;
    public int id;

    public int getId() {
        return id;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public NotebookType getNotebookType() {
        return notebookType;
    }

    public int getPrice() {
        return price;
    }

    public AbstractElementWarehouse(String lotNumber, NotebookType notebookType, int price) {
        this.lotNumber = lotNumber;
        this.notebookType = notebookType;
        this.price = price;

    }
}
