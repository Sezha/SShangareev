package ru.job4j.users;

import java.util.HashMap;
import java.util.List;

/**
 * class UserConvert.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/01/2018.
 */
public class UserConvert {
    /**
     * method process.
     * @param list list of users.
     * @return
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> usersMap = new HashMap<>();
        for (User user : list) {
            usersMap.put(user.getId(), user);
        }
        return usersMap;
    }
}
