package es.rostan.hibernate.baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Rostan on 13/09/2016.
 */
public class conexion {
    private Connection con;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DBMS = "mysql";
    private static final String HOST = "127.0.0.1";
    private static final String PORT = "3306";
    private static final String DATABASE = "dbBaseConocimiento";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    public void conectar ()throws Exception{

        try{
            Class.forName(DRIVER);
            this.con = DriverManager.getConnection("jdbc:" + DBMS + "://" + HOST + ":" + PORT + "/" + DATABASE, USER, PASSWORD);
        }catch(Exception e){
            System.out.println("ERROR: NO SE PUDO CONECTAR CON LA BASE DE DATOS: "+e);
            throw e;
        }
    }

    public void desconectar(){
        try {
            con.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
