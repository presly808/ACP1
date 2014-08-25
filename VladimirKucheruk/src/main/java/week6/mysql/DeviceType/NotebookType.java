package week6.mysql.DeviceType;

import week6.mysql.Components.*;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class NotebookType {

    public Model model;
    public Processor processor;
    public HDD hdd;
    public RAM ram;
    public Video video;
    public Monitor monitor;

    public Model getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HDD getHdd() {
        return hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public Video getVideo() {
        return video;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public NotebookType(Model model, Processor processor, HDD hdd, RAM ram, Video video, Monitor monitor) {

        this.model = model;
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
        this.video = video;
        this.monitor = monitor;
    }
}
