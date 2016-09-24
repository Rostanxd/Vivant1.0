package es.rostan.hibernate.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rostan on 14/09/2016.
 */

@Entity
@Table(name = "dispositivo")
public class dispositivo implements Serializable{

    @Id
    @Column(name = "dspCodigo")
    private String dspCodigo;

    @Column(name = "dspDescripcion")
    private String dspDescripcion;

    @Column(name = "dspEstado")
    private String dspEstado;

    @OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
    public List<dispositivoCrc> listDspCrc = new ArrayList<dispositivoCrc>();

    @OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
    public List<dispositivoApp> listDspApp = new ArrayList<dispositivoApp>();

    //  CONSTRUCTORES
    public dispositivo() {} //  Constructor vacio para hibernate.

    public dispositivo(String dspCodigo, String dspDescripcion, String dspEstado) {
        this.dspCodigo = dspCodigo;
        this.dspDescripcion = dspDescripcion;
        this.dspEstado = dspEstado;
    }

    public dispositivo(String dspCodigo, String dspDescripcion, String dspEstado, List<dispositivoCrc> listDspCrc, List<dispositivoApp> listDspApp) {
        this.dspCodigo = dspCodigo;
        this.dspDescripcion = dspDescripcion;
        this.dspEstado = dspEstado;
        this.listDspCrc = listDspCrc;
        this.listDspApp = listDspApp;
    }

    //  GETTERS Y SETTERS
    public String getDspCodigo() {
        return dspCodigo;
    }

    public void setDspCodigo(String dspCodigo) {
        this.dspCodigo = dspCodigo;
    }

    public String getDspDescripcion() {
        return dspDescripcion;
    }

    public void setDspDescripcion(String dspDescripcion) {
        this.dspDescripcion = dspDescripcion;
    }

    public String getDspEstado() {
        return dspEstado;
    }

    public void setDspEstado(String dspEstado) {
        this.dspEstado = dspEstado;
    }

    public List<dispositivoCrc> getListDspCrc() {
        return listDspCrc;
    }

    public void setListDspCrc(List<dispositivoCrc> listDspCrc) {
        this.listDspCrc = listDspCrc;
    }

    public void setListDspApp(List<dispositivoApp> listDspApp) {
        this.listDspApp = listDspApp;
    }

    public List<dispositivoApp> getListDspApp() {
        return listDspApp;
    }

    //  METODOS
    @Override
    public String toString() {
        return "dispositivo{" +
                "dspCodigo='" + dspCodigo + '\'' +
                ", dspDescripcion='" + dspDescripcion + '\'' +
                ", dspEstado='" + dspEstado + '\'' +
                '}';
    }

}
