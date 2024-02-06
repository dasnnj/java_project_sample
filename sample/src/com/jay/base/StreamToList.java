package com.jay.base;

import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {

        List<String> stringList = List.of("1", "2", "3");
        List<String> largeNumberList = stringList.stream().filter(number -> Long.parseLong(number) > 1).toList();
        List<String> largeNumberList2 = stringList.stream().filter(number -> Long.parseLong(number) > 1).collect(Collectors.toList());
//        largeNumberList.add("4"); //  java.lang.UnsupportedOperationException
        largeNumberList2.add("4"); //success

        // modify custom object
        User userZhang = new User("ZhangSan");
        User userLi = new User("LiSi");
        List<User> userList = List.of(userZhang, userLi);
        List<User> filterList = userList.stream().filter(user -> "LiSi".equals(user.name)).toList();

        User first = filterList.getFirst();//java 21
        first.name = "WangWu";
        filterList.forEach(u -> System.out.println(u.name));
        //List.of返回的也是不能修改的List
        userList.forEach(u -> System.out.print(u.name));

    }
}
