package es.rostan.hibernate.tests;

import es.rostan.hibernate.entidades.app;
import es.rostan.hibernate.entidades.dispositivo;
import es.rostan.hibernate.entidades.dispositivoApp;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 20/09/2016.
 */
public class testDipsApp {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public static void main(String[] args){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        dispositivo d = new dispositivo("000001","Samsung 6","A");
        app a = new app("000001","FaceBook");

        em.persist(d);
        em.persist(a);

        dispositivoApp da = new dispositivoApp(d, a, 5);

        em.persist(da);

        em.getTransaction().commit();
        em.close();

        imprimirTodo();
    }

    public static void imprimirTodo(){
        EntityManager em = emf.createEntityManager();
        List<dispositivoApp> listDispApp = (List<dispositivoApp>) em.createQuery("FROM dispositivoApp ").getResultList();
        System.out.println("En esta base de datos hay "+ listDispApp.size()+ " dispositivos y sus apps.");
        for (dispositivoApp dA : listDispApp){
            System.out.println(dA.toString());
        }
        em.close();
    }
}
