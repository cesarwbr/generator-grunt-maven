package com.sample;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by cesar on 12/25/13.
 */
public class ExampleAction extends ActionSupport{
    private static final long serialVersionUID = 1603825529035130044L;

    public String extecute(){
        return ActionSupport.SUCCESS;
    }
}