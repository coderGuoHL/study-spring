package com.guo.dao;

import java.util.HashMap;

public class UserDao {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 0;i < 10;i++){
            map.put("name","guohailiang");
            map.put("sex","motherFucker");
        }
        System.out.println(map.get("name").toString()+map.get("sex"));
    }
}
