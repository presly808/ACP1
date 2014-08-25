package week6.mysql.DAO;

import week6.mysql.Abstractions.ComponentsDAOInterface;
import week6.mysql.Components.*;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class ComponentsDAO implements ComponentsDAOInterface {
    @Override
    public boolean addModel(Model model) {
        return false;
    }

    @Override
    public boolean deleteModel(Model model) {
        return false;
    }

    @Override
    public boolean addHDD(HDD hdd) {
        return false;
    }

    @Override
    public boolean deleteHDD(HDD hdd) {
        return false;
    }

    @Override
    public boolean addMonitor(Monitor monitor) {
        return false;
    }

    @Override
    public boolean deleteMonitor(Monitor monitor) {
        return false;
    }

    @Override
    public boolean addProcessor(Processor processor) {
        return false;
    }

    @Override
    public boolean deleteProcessor(Processor processor) {
        return false;
    }

    @Override
    public boolean addRAM(RAM ram) {
        return false;
    }

    @Override
    public boolean deleteRAM(RAM ram) {
        return false;
    }

    @Override
    public boolean addVideo(Video video) {
        return false;
    }

    @Override
    public boolean deleteVideo(Video video) {
        return false;
    }
}
