package es.rostan.hibernate.tests;

import es.rostan.hibernate.entidades.caracteristica;
import es.rostan.hibernate.entidades.dispositivo;
import es.rostan.hibernate.entidades.dispositivoCrc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by HP on 20/09/2016.
 */
public class testDipsCrc {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public static void main(String[] args){
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        dispositivo d = new dispositivo("000001","Samsung 6","A");
        caracteristica c = new caracteristica("0000001","Wi-Fi");

        em.persist(d);
        em.persist(c);

        em.persist(new dispositivoCrc(d, c, true));

        em.getTransaction().commit();
        em.close();

        imprimirTodo();


    }

    public static void imprimirTodo(){
        EntityManager em = emf.createEntityManager();
        List<dispositivoCrc> listDispCrc = (List<dispositivoCrc>) em.createQuery("FROM dispositivoCrc ").getResultList();
        System.out.println("En esta base de datos hay "+ listDispCrc.size()+ " dispositivos con sus caracteristicas.");
        for (dispositivoCrc dC : listDispCrc){
            System.out.println(dC.toString());
        }
        em.close();
    }
}
