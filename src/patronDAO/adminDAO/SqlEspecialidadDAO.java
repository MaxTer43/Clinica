package patronDAO.adminDAO;

import java.sql.Connection;

import patronDAO.bean.BeanEspecialidad;
import patronDAO.util.SqlDBConn;

public class SqlEspecialidadDAO implements EspecialidadDAO {

	private Connection getConnection() {

		SqlDBConn cnx = new SqlDBConn();
		return cnx.getConnection();
	}
	
	private EspecialidadDAOImplements especialidad;
	
	@Override
	public void InsertEspecialidad(BeanEspecialidad espec) {
		especialidad.InsertEspecialidad(espec);
	}

}
