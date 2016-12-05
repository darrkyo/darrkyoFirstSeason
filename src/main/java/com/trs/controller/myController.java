package com.trs.controller;

import com.season.aop.Around;
import com.season.core.Controller;
import com.season.core.ControllerKey;
import com.trs.interceptor.myInterceptor;

/**
 * Created by SONY on 2016/12/2.
 */
@ControllerKey("hello")
public class myController extends Controller{
    @Around(myInterceptor.class)
    public void season(){
        renderText("season page");
        System.out.println(getPara("name"));
        System.out.println(getParaToInt("age"));
    }
    public void show(){
        renderJson("{\"age\":18}" );
        System.out.println(getPara(0));
        System.out.println(getParaToInt(1));
    }
    public void show2(){
        renderText("show text2!");
    }
}
