package com.maheshgo.demo.rest.model;


public class SampleModel {

    private String id;
    private String Number;
    public SampleModel(String id, String Number){
        super();
        this.id = id;
        this.Number = Number;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNumber(){
        return Number;
    }
    public void setNumber(String Number){
        this.Number = Number;
    }



} 