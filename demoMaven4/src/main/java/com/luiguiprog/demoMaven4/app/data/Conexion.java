package com.luiguiprog.demoMaven4.app.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Atributos que establecen la conexion
    private String db="AdminEmple";
    private Connection conex= null;
    private String usuario="admin11@base11";
    private String password="M5656185*";
    private String url="jdbc:mysql://base11.mysql.database.azure.com:3306/"+db;

    public Conexion() {
    }

    public Conexion(String db, Connection conex,String usuario, String password, String url){
    super();
    this.db = db;
    this.conex=conex;
    this.usuario=usuario;
    this.password=password;
    this.url=url;
    }
   

    
    
    
    	public Connection getConnection() throws SQLException, ClassNotFoundException{
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	conex=DriverManager.getConnection(url,usuario,password);
    	return conex;
    	}    
    
    
	}

/*public class Conexion {
	
	private String db="demoEmpleados";
	private Connection cnx=null;
	private String usuario="root";
	private String pasword="";
	private String url="jdbc:mysql://localhost:3306/"+db;
	//contructor por defecto 
	public Conexion() {
	}
	//constructor sobre cargado 
	public Conexion(String db, Connection cnx, String usuario, String password, String url) {
		super ();
		this.db = db;
		this.cnx = cnx;
		this.usuario = usuario;
		this.password = password;
		this.url = url;
	}
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cnx=DriverManager.getConnection(url,usuario,password);
		return cnx;
	}

}*/
