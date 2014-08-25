package week6.mysql.Abstractions;

import week6.mysql.Components.*;

import java.util.Properties;

/**
 * Created by vkucheru on 17.07.2014.
 */
public interface ComponentsDAOInterface {

    public boolean addModel(Model model);
    public boolean deleteModel(Model model);

    public boolean addHDD(HDD hdd);
    public boolean deleteHDD(HDD hdd);

    public boolean addMonitor(Monitor monitor);
    public boolean deleteMonitor(Monitor monitor);

    public boolean addProcessor(Processor processor);
    public boolean deleteProcessor(Processor processor);

    public boolean addRAM(RAM ram);
    public boolean deleteRAM(RAM ram);

    public boolean addVideo(Video video);
    public boolean deleteVideo(Video video);

}
