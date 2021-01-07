package com.ensa;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Trigger implements
        ApplicationListener<ContextRefreshedEvent> {

    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
        Client client = new Client();
        client.setNom("Oukssim");
        Compte compte = new Compte();
        client.setCp(cpt);
        client.verser(800);
        client.retirer(90);
        System.out.println("name: "+compte.getNom() + " " +compte.getCp().getSolde());

    }
}