package artcode.week5.day1.observer;


/**
 * Created by amakogon on 05.07.2014.
 */
public class AvalBank implements MyObserver {

    private BabloSubject informationNews;

    private static final String BANK_NAME = "AvalBank";

    private int avalCourse;

    public AvalBank(BabloSubject informationNews) {
        this.informationNews = informationNews;
        informationNews.registerObserver(this);
    }

    @Override
    public void update() {
        avalCourse = informationNews.getCourse();
    }

    public int getAvalCourse() {
        return avalCourse;
    }
}
