package es.rostan.hibernate.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rostan on 14/09/2016.
 */

@Entity
@Table(name = "dispositivoCrc")
public class dispositivoCrc implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "dspCodigo")
    private dispositivo dispositivo;

    @Id
    @OneToOne()
    @JoinColumn(name = "crcCodigo")
    private caracteristica crc;

    @Column(name = "dspCrcExiste")
    private Boolean dspCrcExiste;


    //  CONSTRUCTORES
    public dispositivoCrc(){}   //  Constructor vacio para hibernate.

    public dispositivoCrc(es.rostan.hibernate.entidades.dispositivo dispositivo, caracteristica crc, Boolean dspCrcExiste) {
        this.dispositivo = dispositivo;
        this.crc = crc;
        this.dspCrcExiste = dspCrcExiste;
    }

    //  GETTER Y SETTERS
    public Boolean getDspCrcExiste() {
        return dspCrcExiste;
    }

    public void setDspCrcExiste(Boolean dspCrcExiste) {
        this.dspCrcExiste = dspCrcExiste;
    }

    public es.rostan.hibernate.entidades.dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(es.rostan.hibernate.entidades.dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public caracteristica getCrc() {
        return crc;
    }

    public void setCrc(caracteristica crc) {
        this.crc = crc;
    }

    //  METODOS
    @Override
    public String toString() {
        return "dispositivoCrc{" +
                "dispositivo=" + dispositivo.toString() +
                ", crc=" + crc.toString() +
                ", dspCrcExiste=" + String.valueOf(dspCrcExiste) +
                '}';
    }
}