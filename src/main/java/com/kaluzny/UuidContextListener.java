package com.kaluzny;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Logger;

@WebListener
public class UuidContextListener implements ServletContextListener {

    private static final Logger LOGGER = Logger.getLogger(UuidContextListener.class.getName());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("Add generator into the servlet context.");
        sce.getServletContext().setAttribute(UuidGenerator.class.getName(), new UuidGenerator());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}