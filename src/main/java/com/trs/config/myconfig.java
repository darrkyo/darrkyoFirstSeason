package com.trs.config;

import com.season.config.Constants;
import com.season.core.Season;
import com.season.core.spring.SeasonApplication;
import com.season.core.spring.SeasonRunner;

/**
 * Created by SONY on 2016/12/2.
 */
public class myconfig extends SeasonApplication {

    @Override
    public void configConstant(Constants me) {
        super.configConstant(me);
    }

    public static void main(String[] args) {
        SeasonRunner.run(myconfig.class);
    }

    @Override
    public void afterStart() {
        super.afterStart();
        System.out.println("系统已启动");

    }

    @Override
    public void beforeStop() {
        super.beforeStop();
        System.out.println("系统将关闭");
    }
}
