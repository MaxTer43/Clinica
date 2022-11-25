package patronDAO.adminDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.conexion;
import patronDAO.bean.BeanRecepcionista;

public class RecepcionistaDAOImplements implements RecepcionistaDAO {

	private Connection getConnection(){
		conexion conex=new conexion();
		return conex.getConnection(conexion.SQL);
	}

	@Override
	public void InsertRecepcionista(BeanRecepcionista recep) {
		String sql;
		try{
		sql="insert into recepcionistas values('"
			+recep.getNombres()
			+"','"
			+recep.getApellidos()
			+"','"
			+recep.getIdUsuario()
			+"','"
			+recep.getClave()
			+"')";
		//Llama a la conexiom
			Connection cnx=getConnection();
		//ejecutar el SQL	
			Statement stm= cnx.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Insertar Recepcionista:DAO");
			stm.close();
			cnx.close();
		}catch (SQLException e){
			System.out.println("Ocurrió una excepcion al insertar"+e);		
		}
	}
}
