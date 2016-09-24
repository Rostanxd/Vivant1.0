package es.rostan.hibernate.entidades;

import es.rostan.hibernate.entidades.dispositivoApp;
import es.rostan.hibernate.entidades.dispositivoCrc;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2016-09-23T15:56:59")
@StaticMetamodel(dispositivo.class)
public class dispositivo_ { 

    public static volatile SingularAttribute<dispositivo, String> dspDescripcion;
    public static volatile SingularAttribute<dispositivo, String> dspEstado;
    public static volatile SingularAttribute<dispositivo, String> dspCodigo;
    public static volatile ListAttribute<dispositivo, dispositivoApp> listDspApp;
    public static volatile ListAttribute<dispositivo, dispositivoCrc> listDspCrc;

}