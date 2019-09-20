package org.example.demo.ticket.webapp.listener;

import org.example.demo.ticket.business.manager.ManagerFactory;
import org.example.demo.ticket.webapp.rest.resource.ticket.AbstractResource;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DependencyInjectionListener implements ServletContextListener {

    @Override
    public void contextInitialized (ServletContextEvent sce){
        //Creétaion de l'instance de ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactory();

        //Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce){

    }
}
