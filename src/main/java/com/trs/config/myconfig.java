package com.trs.config;

import com.season.core.Season;
import com.season.core.spring.SeasonApplication;
import com.season.core.spring.SeasonRunner;

/**
 * Created by SONY on 2016/12/2.
 */
public class myconfig extends SeasonApplication {
    public static void main(String[] args) {
        SeasonRunner.run(myconfig.class);
    }
}
