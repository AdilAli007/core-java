package com.encapsulationParent;

public class Police {
    private String name ;
    private String area ;
    private int beltNo;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }
    public void setBeltNo(int beltNo){
        this.beltNo = beltNo;
    }
    public int getBeltNo(){
        return beltNo;
    }
}
