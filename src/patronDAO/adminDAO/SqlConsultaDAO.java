package patronDAO.adminDAO;

import java.sql.Connection;

import patronDAO.bean.BeanConsulta;
import patronDAO.util.SqlDBConn;

public class SqlConsultaDAO implements ConsultaDAO {

	private Connection getConnection() {

		SqlDBConn cnx = new SqlDBConn();
		return cnx.getConnection();
	}
	
	private ConsultaDAOImplements consulta;
	
	@Override
	public void InsertConsulta(BeanConsulta cons) {
		consulta.InsertConsulta(cons);
	}
}
