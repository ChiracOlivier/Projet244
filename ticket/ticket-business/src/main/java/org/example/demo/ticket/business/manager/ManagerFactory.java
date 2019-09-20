package org.example.demo.ticket.business.manager;

public class ManagerFactory {

    public ProjetManager getProjetManager(){
        return new ProjetManager();
    }
    public TicketManager getTicketManager(){
        return new TicketManager();
    }
}
