package com.zingking.dingrebot;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Copyright (c) 2019, Z.kai All rights reserved.
 * author：Z.kai
 * date：2019/1/9
 * description：
 */
public class ZingListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        new TimerManager();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub

    }

}
