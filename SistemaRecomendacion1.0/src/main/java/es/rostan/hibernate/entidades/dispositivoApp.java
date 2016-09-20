package es.rostan.hibernate.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by HP on 20/09/2016.
 */
@Entity
public class dispositivoApp implements Serializable{

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dspCodigo")
    private dispositivo dispositivo;

    @Id
    @OneToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "appCodigo")
    private app app;

    @Column(name = "dspAppCalificacion")
    private int dspAppCalificacion;


    //  CO0NSTRUCTORES
    public dispositivoApp() {}  //  Constructor vacio para hibernate.

    public dispositivoApp(dispositivo dispositivo, es.rostan.hibernate.entidades.app app, int dspAppCalificacion) {
        this.dispositivo = dispositivo;
        this.app = app;
        this.dspAppCalificacion = dspAppCalificacion;
    }


    //  GETTER Y SETTERS
    public dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(dispositivo disp) {
        this.dispositivo = disp;
    }

    public es.rostan.hibernate.entidades.app getApp() {
        return app;
    }

    public void setApp(es.rostan.hibernate.entidades.app app) {
        this.app = app;
    }

    public int getCalificacion() {
        return dspAppCalificacion;
    }

    public void setCalificacion(int calificacion) {
        this.dspAppCalificacion = calificacion;
    }

    //  METODOS

    @Override
    public String toString() {
        return "dispositivoApp{" +
                "dspAppCalificacion=" + dspAppCalificacion +
                ", app=" + app +
                ", disp=" + dispositivo +
                '}';
    }
}
