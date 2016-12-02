package com.trs.controller;

import com.season.core.Controller;
import com.season.core.ControllerKey;

/**
 * Created by SONY on 2016/12/2.
 */
@ControllerKey("hello")
public class myController extends Controller{
    public void season(){
        renderText("hi season!");
    }
    public void show(){
        renderText("show text!");
    }
}
