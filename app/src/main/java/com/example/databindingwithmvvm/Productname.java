package com.example.databindingwithmvvm;

public class Productname {
    String name;
    int num;

    public Productname(String name,int num) {
        this.name = name;
        this.num=num;
    }
    public int getnum(int num){
        return num;

    }
    public void setNum(){
        this.num=num;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
