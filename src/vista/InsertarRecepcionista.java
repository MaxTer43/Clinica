package vista;

import patronDAO.adminDAO.DAOFactory;
import patronDAO.adminDAO.RecepcionistaDAO;
import patronDAO.bean.BeanRecepcionista;

public class InsertarRecepcionista {

	public static void main(String[] args) {
		BeanRecepcionista bean = new BeanRecepcionista();
		DAOFactory factory = DAOFactory.getDAOFactory(4);
		RecepcionistaDAO dao = factory.getRecepcionistaDAO();
		
		bean.setNombres("Diego Enciso");
		bean.setApellidos("Enciso Lozano");
		bean.setIdUsuario("1");
		bean.setClave("1234");
		
		dao.InsertRecepcionista(bean);
		System.out.println(bean + "¡Se insertó!");
	}
}
