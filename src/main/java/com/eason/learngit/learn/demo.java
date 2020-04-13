package com.eason.learngit.learn;

import java.util.ArrayList;
import java.util.List;

/**
 * demo
 *
 * @author eason 111
 * @date 2020/02/2020-02-05
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("hello world");
        // System.out.println("origin");
        System.out.println("创建了zhutianloing分支");
        System.out.println("在zhutianlong分支上修改");
        List<String> stringList = new ArrayList<String>();

        User user = new User();
        UserDao userDao = new UserDao();
        userDao.getById(15);
    }
}
