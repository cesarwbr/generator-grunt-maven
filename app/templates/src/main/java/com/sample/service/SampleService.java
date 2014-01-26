package com.sample.service;

import com.sample.view.SampleView;
import es.cenobit.struts2.json.annotations.Json;
import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 1/26/14.
 */
public class SampleService {
    private Long id;
    private String name;
    private String description;

    @Json
    public Object generic() {

        String method = ServletActionContext.getRequest().getMethod();
        if ( method.equals( "GET" ) ) {
            return findAllSample();
        }
        else if ( method.equals( "POST" ) ) {
            return saveSample();
        }
        return null;
    }

    private SampleView saveSample() {
        SampleView sampleView = new SampleView();
        sampleView.setId(this.id);
        sampleView.setName(this.name);
        sampleView.setDescription(this.description);

        // TODO save object

        return sampleView;
    }

    private List<SampleView> findAllSample(){

        // TODO call a service

        List<SampleView> sampleViews = new ArrayList<SampleView>();

        SampleView sampleView = new SampleView();
        sampleView.setName("Test 1");
        sampleView.setDescription("Description 1");
        sampleViews.add(sampleView);

        sampleView = new SampleView();
        sampleView.setName("Test 2");
        sampleView.setDescription("Description 2");
        sampleViews.add(sampleView);

        sampleView = new SampleView();
        sampleView.setName("Test 3");
        sampleView.setDescription("Description 3");
        sampleViews.add(sampleView);

        return sampleViews;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
