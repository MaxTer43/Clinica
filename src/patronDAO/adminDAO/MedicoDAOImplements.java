package patronDAO.adminDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.conexion;
import patronDAO.bean.BeanMedico;

public class MedicoDAOImplements implements MedicoDAO {

	private Connection getConnection(){
		conexion conex=new conexion();
		return conex.getConnection(conexion.SQL);
	}
	
	@Override
	public void InsertMedico(BeanMedico med) {
		String sql;
		try{
		sql="insert into medicos values('"
			+med.getCmp()
			+"','"
			+med.getNombres()
			+"','"
			+med.getApellidos()
			+"','"
			+med.getFechaNacimiento()
			+"','"
			+med.getSexo()
			+"','"
			+med.getDireccion()
			+"','"
			+med.getCorreo()
			+"','"
			+med.getTelefono()
			+"','"
			+med.getDni()
			+"')";
		//Llama a la conexiom
			Connection cnx=getConnection();
		//ejecutar el SQL	
			Statement stm= cnx.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Insertar Medico:DAO");
			stm.close();
			cnx.close();
		}catch (SQLException e){
			System.out.println("Ocurrió una excepcion al insertar"+e);		
		}
	}
}
