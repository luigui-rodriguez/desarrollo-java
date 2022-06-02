package com.luiguiprog.demoMaven4.app.facade.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.luiguiprog.demoMaven4.app.data.Conexion;
import com.luiguiprog.demoMaven4.app.facade.IDepartamento;
import com.luiguiprog.demoMaven4.app.model.Departamento;

public class Departamentoimp extends Conexion implements IDepartamento {

	
	private PreparedStatement pstDepartamento= null;
	private ResultSet rsDepartamento=null;
	private String query="";
	private List<Departamento> listDepartamento=new ArrayList<> ();
	
	@Override
	public List<Departamento> buscarTodos() {
		this.query = "SELECT * FROM AdminEmple";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				while(this.rsDepartamento.next()) {
					Departamento departamento=new Departamento () ;
					Departamento.setId(this.rsDepartamento.getLong("id"));
					departamento.setNombre_departamento(this.rsDepartamento.getString("nombre_departamento"));
					departamento.setCodigo_departamento(this.rsDepartamento.getString("departamento_codigo"));
					departamento.setFecha_hora_crea(this.rsDepartamento.getDate("Fecha_hora_crea"));
					departamento.setFecha_hora_modifica(this.rsDepartamento.getDate("Fecha_hora_modifica"));
					this.listDepartamento.add(departamento);
				}
			}
		}catch (Exception e) {
			
		}
		return this.listDepartamento;
	}

	@Override
	public Departamento buscarPorId(long id) {
		Departamento departamento=new Departamento () ;
		this.query = "SELECT * FROM AdminEmple where id=?";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.pstDepartamento.setLong(1, id);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				while(this.rsDepartamento.next()) {
				
					Departamento.setId(this.rsDepartamento.getLong("id"));
					departamento.setNombre_departamento(this.rsDepartamento.getString("nombre_departamento"));
					departamento.setCodigo_departamento(this.rsDepartamento.getString("departamento_codigo"));
					departamento.setFecha_hora_crea(this.rsDepartamento.getDate("Fecha_hora_crea"));
					departamento.setFecha_hora_modifica(this.rsDepartamento.getDate("Fecha_hora_modifica"));
					this.listDepartamento.add(departamento);
				}
			}
		}catch (Exception e) {
			
		}
	
		return departamento;
	}

	@Override
	public void crearDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarDepartamento(Departamento departamento) {
		Departamento departamento1=new Departamento () ;
		this.query = "UPDATE FROM SET nombre_departamento=, departamento_codigo=?"+ "fecha_hora_crea=?,fecha_hora_crea=? where id=?";
		try {
			if(this.getConnection()!=null) {
				this.pstDepartamento=this.getConnection().prepareStatement(query);
				this.rsDepartamento=this.pstDepartamento.executeQuery();
				
			}
		}catch (Exception e) {
			
		}
		
	}

	@Override
	public void eliminarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

}
