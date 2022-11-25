package patronDAO.adminDAO;

import java.sql.Connection;

import patronDAO.bean.BeanPaciente;
import patronDAO.util.SqlDBConn;

public class SqlPacienteDAO implements PacienteDAO {

	private Connection getConnection() {

		SqlDBConn cnx = new SqlDBConn();
		return cnx.getConnection();
	}
	
	private PacienteDAOImplements paciente;
	
	@Override
	public void InsertPaciente(BeanPaciente pac) {
		paciente.InsertPaciente(pac);
	}
}
