package ua.com.artcode.utils;

import ua.com.artcode.model.User;

/**
 * Created by admin on 09.06.2014.
 */
public interface IFileHelper {

    boolean deepSave(User user);
    User deepLoad();

}
