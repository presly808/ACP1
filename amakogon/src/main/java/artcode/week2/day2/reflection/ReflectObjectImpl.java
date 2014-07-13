package artcode.week2.day2.reflection;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by amakogon on 15.06.2014.
 */
public class ReflectObjectImpl implements IReflectObject {
    @Override
    public List<String[]> getObjectData(String[] info) {
        List<String[]> userInfo = new LinkedList<String[]>();
        for (int i = 0; i < info.length; i++) {
            String[] temp = info[i].split("\n");
            String[] userInfoCell = new String[temp.length - 1];
            System.arraycopy(temp, 1, userInfoCell, 0, temp.length - 1);
            userInfo.add(userInfoCell);
        }
        return userInfo;
    }

    @Override
    public Object instantiate(String[] objectInfo) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (objectInfo == null || objectInfo.length == 0) {
            return null;
        }
        Class objectClass = Class.forName(objectInfo[0]);

        return objectClass.newInstance();
    }

    @Override
    public void setFields(String[] objectInfo, Object obj) throws IllegalAccessException {
//        Field[] fields = new Field[objectInfo.length -1];
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0, j = 1; i < fields.length; i++,j++) {
            fields[i].setAccessible(true);
            String[] data = objectInfo[j].split("=");
            fields[i].set(obj,data[data.length-1]);
        }
    }
}
