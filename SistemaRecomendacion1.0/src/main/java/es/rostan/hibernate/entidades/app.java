package es.rostan.hibernate.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Rostan on 14/09/2016.
 */

@Entity
@Table(name = "app")
public class app implements Serializable{

    @Id
    @Column(name = "appCodigo")
    private String appCodigo;

    @Column(name = "appDescripcion")
    private String appDescripcion;

    public app(){}  //  Constructor vacio para hbernate

    public app(String appCodigo, String appDescripcion) {
        this.appCodigo = appCodigo;
        this.appDescripcion = appDescripcion;
    }

    public String getAppCodigo() {
        return appCodigo;
    }

    public void setAppCodigo(String appCodigo) {
        this.appCodigo = appCodigo;
    }

    public String getAppDescripcion() {
        return appDescripcion;
    }

    public void setAppDescripcion(String appDescripcion) {
        this.appDescripcion = appDescripcion;
    }

    @Override
    public String toString() {
        return "app{" +
                "appCodigo='" + appCodigo + '\'' +
                ", appDescripcion='" + appDescripcion + '\'' +
                '}';
    }
}
