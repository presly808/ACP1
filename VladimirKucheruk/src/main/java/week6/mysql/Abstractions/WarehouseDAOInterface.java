package week6.mysql.Abstractions;

import week6.mysql.Warehouse.ElementWarehouse;

/**
 * Created by vkucheru on 18.07.2014.
 */
public interface WarehouseDAOInterface {

    public boolean addNotebookType(ElementWarehouse elementWarehouse);

    public boolean deleteNotebookType(ElementWarehouse elementWarehouse);


}
