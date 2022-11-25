package patronDAO.adminDAO;

import java.sql.Connection;

import patronDAO.bean.BeanMedico;
import patronDAO.util.SqlDBConn;

public class SqlMedicoDAO implements MedicoDAO {

	private Connection getConnection() {

		SqlDBConn cnx = new SqlDBConn();
		return cnx.getConnection();
	}
	
	private MedicoDAOImplements medico;
	
	@Override
	public void InsertMedico(BeanMedico med) {
		medico.InsertMedico(med);
	}
}
