package es.rostan.hibernate.entidades;

import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Rostan on 13/09/2016.
 * Clase
 */

@Entity
@Table(name = "caracteristica")
public class caracteristica implements Serializable{

    @Id
    @Column(name = "crcCodigo")
    private String crcCodigo;

    @Column(name = "crcDescripcion")
    private String crcDescripcion;

    public caracteristica(){}   //  Constructor vacio para hibernate

    public caracteristica(String crcCodigo, String crcDescripcion) {
        this.crcCodigo = crcCodigo;
        this.crcDescripcion = crcDescripcion;
    }

    public String getCrcCodigo() {
        return crcCodigo;
    }

    public void setCrcCodigo(String crcCodigo) {
        this.crcCodigo = crcCodigo;
    }

    public String getCrcDescripcion() {
        return crcDescripcion;
    }

    public void setCrcDescripcion(String crcDescripcion) {
        this.crcDescripcion = crcDescripcion;
    }

    @Override
    public String toString() {
        return "caracteristica{" +
                "crcCodigo='" + crcCodigo + '\'' +
                ", crcDescripcion='" + crcDescripcion + '\'' +
                '}';
    }
}
