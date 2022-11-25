package patronDAO.adminDAO;

import patronDAO.bean.*;
import patronDAO.util.*;
import patronDAO.bean.BeanRecepcionista;

import java.sql.*;

public class SqlRecepcionistaDAO implements RecepcionistaDAO {

	private Connection getConnection() {

		SqlDBConn cnx = new SqlDBConn();
		return cnx.getConnection();
	}
	
	private RecepcionistaDAOImplements recepcionista;
	
	@Override
	public void InsertRecepcionista(BeanRecepcionista recep) {
		recepcionista.InsertRecepcionista(recep);
	}
}
