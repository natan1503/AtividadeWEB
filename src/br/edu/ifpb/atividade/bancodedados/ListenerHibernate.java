package br.edu.ifpb.atividade.bancodedados;

import javax.servlet.ServletContextEvent;


public class ListenerHibernate {
	
	public void contextInitialized(ServletContextEvent event) {  
        UtilHibernate.getSessionFactory(); 
    }  
  
    public void contextDestroyed(ServletContextEvent event) {  
    	UtilHibernate.getSessionFactory().close();
    }  

}
