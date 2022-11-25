package patronDAO.adminDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.conexion;
import patronDAO.bean.BeanPaciente;

public class PacienteDAOImplements implements PacienteDAO {

	private Connection getConnection(){
		conexion conex=new conexion();
		return conex.getConnection(conexion.SQL);
	}
	
	@Override
	public void InsertPaciente(BeanPaciente pac) {
		String sql;
		try{
		sql="insert into pacientes values('"
			+pac.getNombres()
			+"','"
			+pac.getApellidos()
			+"','"
			+pac.getFechaNacimiento()
			+"','"
			+pac.getSexo()
			+"','"
			+pac.getDireccion()
			+"','"
			+pac.getCorreo()
			+"','"
			+pac.getTelefono()
			+"','"
			+pac.getDni()
			+"','"
			+pac.getPeso()
			+"','"
			+pac.getTalla()
			+"')";
		//Llama a la conexiom
			Connection cnx=getConnection();
		//ejecutar el SQL	
			Statement stm= cnx.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Insertar Paciente:DAO");
			stm.close();
			cnx.close();
		}catch (SQLException e){
			System.out.println("Ocurrió una excepcion al insertar"+e);		
		}
	}
}
