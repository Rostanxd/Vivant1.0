package es.rostan.hibernate.entidades;

import javax.persistence.*;
import java.io.Serializable;
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

//    @OneToMany(mappedBy = "dispositivo")
//    private List<dispositivoCrc> listaDspCrc;   //  Lista, referencia a la tabla de dispositivosCrc.

    public dispositivo() {} //  Constructor vacio para hibernate.

    public dispositivo(String dspCodigo, String dspDescripcion, String dspEstado) {
        this.dspCodigo = dspCodigo;
        this.dspDescripcion = dspDescripcion;
        this.dspEstado = dspEstado;
    }

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

//    public void setListaDspCrc(List<dispositivoCrc> listaDspCrc) {
//        this.listaDspCrc = listaDspCrc;
//    }
//
//    public List<dispositivoCrc> getListaDspCrc() {
//        return listaDspCrc;
//    }

    @Override
    public String toString() {
        return "dispositivo{" +
                "dspCodigo='" + dspCodigo + '\'' +
                ", dspDescripcion='" + dspDescripcion + '\'' +
                ", dspEstado='" + dspEstado + '\'' +
                '}';
    }

//    public void addDispositivoCrc(dispositivoCrc dc){
//        listaDspCrc.add(dc);
//    }

//    public dispositivo(String dspCodigo, String dspDescripcion, String dspEstado, List<dispositivoCrc> listaDspCrc) {
//        this.dspCodigo = dspCodigo;
//        this.dspDescripcion = dspDescripcion;
//        this.dspEstado = dspEstado;
//        this.listaDspCrc = listaDspCrc;
//    }

}
