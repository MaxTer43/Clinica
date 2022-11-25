package patronDAO.adminDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.conexion;
import patronDAO.bean.BeanConsulta;

public class ConsultaDAOImplements implements ConsultaDAO {

	private Connection getConnection(){
		conexion conex=new conexion();
		return conex.getConnection(conexion.SQL);
	}
	
	@Override
	public void InsertConsulta(BeanConsulta cons) {
		String sql;
		try{
		sql="insert into consultas values('"
			+cons.getConsultorio()
			+"','"
			+cons.getDescripcion()
			+"','"
			+cons.getFecha()
			+"','"
			+cons.getEstado()
			+"','"
			+cons.getPaciente()
			+"','"
			+cons.getMedico()
			+"','"
			+cons.getEspecialidad()
			+"')";
		//Llama a la conexiom
			Connection cnx=getConnection();
		//ejecutar el SQL	
			Statement stm= cnx.createStatement();
			stm.executeUpdate(sql);
			System.out.println("Insertar Consulta:DAO");
			stm.close();
			cnx.close();
		}catch (SQLException e){
			System.out.println("Ocurrió una excepcion al insertar"+e);		
		}
	}
}
