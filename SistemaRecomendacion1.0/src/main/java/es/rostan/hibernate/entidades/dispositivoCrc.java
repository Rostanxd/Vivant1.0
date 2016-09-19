package es.rostan.hibernate.entidades;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rostan on 14/09/2016.
 */

@Entity
public class dispositivoCrc implements Serializable{

    /*
    @ManyToOne
    @JoinColumn(name="dspCodigo")
    private dispositivo dispositivo;

    @ManyToOne
    @JoinColumn(name="crcCodigo")
    private caracteristica caracteristica;
    */

    @Id
    @Column(name = "dspCrcExiste")
    private Boolean dspCrcExiste;

    public dispositivoCrc(){}   //  Constructor vacio para hibernate.

    /*
    public caracteristica getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    */
    public Boolean getDspCrcExiste() {
        return dspCrcExiste;
    }

    public void setDspCrcExiste(Boolean dspCrcExiste) {
        this.dspCrcExiste = dspCrcExiste;
    }
}
