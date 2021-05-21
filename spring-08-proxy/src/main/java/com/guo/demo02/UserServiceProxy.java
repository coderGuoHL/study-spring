package com.guo.demo02;

public class UserServiceProxy implements UserService{
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        userService.delete();
    }

    public void update() {
        userService.update();
    }

    public void select() {
        userService.select();
    }

    public void log(String type) {
        System.out.println("[Debug] 使用了" + type + "方法");
    }
}
