/*
 * Created on 01/10/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package patronDAO.adminDAO;

import patronDAO.adminDAO.RecepcionistaDAO;
import patronDAO.adminDAO.RecepcionistaDAOImplements;

public class SqlDAOFactory extends DAOFactory{

	@Override
	public RecepcionistaDAO getRecepcionistaDAO() {
		// TODO Auto-generated method stub
		return new RecepcionistaDAOImplements();
	}

	@Override
	public MedicoDAO getMedicoDAO() {
		// TODO Auto-generated method stub
		return new MedicoDAOImplements();
	}

	@Override
	public PacienteDAO getPacienteDAO() {
		// TODO Auto-generated method stub
		return new PacienteDAOImplements();
	}

	@Override
	public EspecialidadDAO getEspecialidadDAO() {
		// TODO Auto-generated method stub
		return new EspecialidadDAOImplements();
	}

	@Override
	public ConsultaDAO getConsultaDAO() {
		// TODO Auto-generated method stub
		return new ConsultaDAOImplements();
	}   
}
