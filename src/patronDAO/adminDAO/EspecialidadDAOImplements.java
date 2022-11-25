package patronDAO.adminDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.conexion;
import patronDAO.bean.BeanEspecialidad;

public class EspecialidadDAOImplements implements EspecialidadDAO {
	
	private Connection getConnection(){
		conexion conex=new conexion();
		return conex.getConnection(conexion.SQL);
	}
	
	@Override
	public void InsertEspecialidad(BeanEspecialidad espec) {
		String sql;
		try{
		sql="insert into especialidades values('"
			+espec.getNombre()
			+"')";
		//Llama a la conexiom
			Connection cnx=getConnection();
		//ejecutar el SQL	
			Statement stm= cnx.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Insertar Especialidad:DAO");
			stm.close();
			cnx.close();
		}catch (SQLException e){
			System.out.println("Ocurrió una excepcion al insertar"+e);		
		}
	}
}
