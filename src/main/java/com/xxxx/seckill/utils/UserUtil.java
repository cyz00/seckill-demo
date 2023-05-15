package com.xxxx.seckill.utils;


import com.xxxx.seckill.pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成用户工具类
 *
 * @author: LC
 * @date 2022/3/4 3:29 下午
 * @ClassName: UserUtil
 */
public class UserUtil {
    private static void createUser(int count){
        List<User> users = new ArrayList<>(count);
        for(int i=0;i<count;i++){
            User user = new User();
            user.setId(1300000000L+i);
            user.setNickname("user"+i);
            user.setSlat("1a2b3c");
            user.setPassword(MD5Util.inputPassToDBPass("123456",user.getSlat()));
        }
        System.out.println("create user");
//        Connection conn = getConn();
    }

    private static Connection getConn() throws Exception{
        String url = "jdbc:mysql://localhost:3306/seckill?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password="zcy875640296";
        String driver="com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        return DriverManager.getConnection(url,username,password);

    }


}
