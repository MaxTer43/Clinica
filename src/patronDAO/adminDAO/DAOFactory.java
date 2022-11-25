/*
 * 
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package patronDAO.adminDAO;



/**
 * 
 * Se definen  
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;
    
    // Existirá un método por cada DAO que pueda ser creado.
    // En este clase se asume solo se crearan 2 DAOs.
    
    
    public abstract RecepcionistaDAO getRecepcionistaDAO();
    public abstract MedicoDAO getMedicoDAO();
    public abstract PacienteDAO getPacienteDAO();
    public abstract EspecialidadDAO getEspecialidadDAO();
    public abstract ConsultaDAO getConsultaDAO();
    
    public static DAOFactory getDAOFactory(int whichFactory){
       switch(whichFactory){
       	case SQLSERVER:
       	    return new SqlDAOFactory();
       /*	case ORACLE:
       	    return new OracleDAOFactory();
       	case DB2:
       	    return new Db2DAOFactory();
       	case SQLSERVER:
       	    return new SqlServerDAOFactory();
       	case XML:
       	    return new XmlDAOFactory();*/
       	default:
       	    return null;
       }
    }   
}
