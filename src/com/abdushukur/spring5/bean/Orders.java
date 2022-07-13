package com.abdushukur.spring5.bean;

public class Orders {
    public Orders() {
        System.out.println("Step 1 Bean parameters");
    }

    private String oname;
    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("Step 2 Use set method");
    }

    public void initMethod() {
        System.out.println("Step 3 .....");
    }

    public void destroyMethod() {
        System.out.println("Step 5 .....");
    }
}
