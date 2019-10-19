package com.maheshgo.demo.rest.dao;

import com.maheshgo.demo.rest.model.SampleModel;

import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {
    private static SampleModel sample = new SampleModel("Mahesh", "8883207505");
    public SampleModel getSample(){
        return sample;
    } 
}