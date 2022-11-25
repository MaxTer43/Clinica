package vista;

import java.util.Scanner;

import patronDAO.adminDAO.ConsultaDAO;
import patronDAO.adminDAO.DAOFactory;
import patronDAO.adminDAO.EspecialidadDAO;
import patronDAO.adminDAO.MedicoDAO;
import patronDAO.adminDAO.PacienteDAO;
import patronDAO.adminDAO.RecepcionistaDAO;
import patronDAO.bean.BeanConsulta;
import patronDAO.bean.BeanEspecialidad;
import patronDAO.bean.BeanMedico;
import patronDAO.bean.BeanPaciente;
import patronDAO.bean.BeanRecepcionista;

public class InsertConsulta {

	public static void main(String[] args) {
		BeanPaciente paciente = new BeanPaciente();
		BeanMedico medico = new BeanMedico();
		BeanEspecialidad especialidad = new BeanEspecialidad();
		BeanRecepcionista recepcionista = new BeanRecepcionista();
		BeanConsulta consulta = new BeanConsulta();
		DAOFactory factory = DAOFactory.getDAOFactory(4);
		PacienteDAO daoP = factory.getPacienteDAO();
		MedicoDAO daoM = factory.getMedicoDAO();
		EspecialidadDAO daoE = factory.getEspecialidadDAO();
		RecepcionistaDAO daoR = factory.getRecepcionistaDAO();
		ConsultaDAO daoC = factory.getConsultaDAO();
		//Consu
		
		//Paciente
		String nombresP;
		String apellidosP;
		String fechaNacimientoP;
		String sexoP;
		String direccionP;
		String correoP;
		int telefonoP;
		int dniP;
		float pesoP;
		float tallaP;
		
		paciente.setNombres("Maximo Gil");
		paciente.setApellidos("Mallqui Tertuliano");
		paciente.setFechaNacimiento("1998-05-05");
		paciente.setSexo("masculino");
		paciente.setDireccion("Av. Lima 123");
		paciente.setCorreo("maximo@gmail.com");
		paciente.setTelefono(987654321);
		paciente.setDni(85223366);
		paciente.setPeso(50.5f);
		paciente.setTalla(1.50f);
		
		//Medico
		int cmpM;
		String nombresM;
		String apellidosM;
		String fechaNacimientoM;
		String sexoM;
		String direccionM;
		String correoM;
		int telefonoM;
		int dniM;
		
		medico.setCmp(225531);
		medico.setNombres("Sergio Gilberto");
		medico.setApellidos("Alva Rosales");
		medico.setFechaNacimiento("1965-06-06");
		medico.setSexo("masculino");
		medico.setDireccion("Av. Primavera 152");
		medico.setCorreo("sergio@gmail.com");
		medico.setTelefono(987258369);
		medico.setDni(55223366);
		
		//Especialidad
		String nombreE;
		
		especialidad.setNombre("Pediatría");
		
		//Recepcionista
		String nombresR;
		String apellidosR;
		String idUsuarioR;
		String claveR;
		
		recepcionista.setNombres("Carlos");
		recepcionista.setApellidos("Figueroa Alaya");
		recepcionista.setIdUsuario("1");
		recepcionista.setClave("1234");
		
		//Consulta
		String consultorioC;
		String descripcionC;
		String fechaC;
		String estadoC;
		//BeanPaciente paciente;
		//BeanMedico medico;
		//BeanEspecialidad especialidad;
		
		System.out.println("REGISTRO DE CONSULTA");			
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese consultorio: ");			
		consultorioC =teclado.nextLine();
		
		System.out.print("Ingrese descripcion: ");			
		descripcionC =teclado.nextLine();
		
		System.out.print("Ingrese fecha y hora asignada: ");			
		fechaC =teclado.nextLine();
		
		System.out.print("Ingrese estado: ");			
		estadoC =teclado.nextLine();
		
		consulta.setConsultorio(consultorioC);
		consulta.setDescripcion(descripcionC);
		consulta.setFecha(fechaC);
		consulta.setEstado(estadoC);
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setEspecialidad(especialidad);
		
		daoP.InsertPaciente(paciente);
		daoM.InsertMedico(medico);
		daoE.InsertEspecialidad(especialidad);
		daoC.InsertConsulta(consulta);
		System.out.println(consulta + "¡Se insertó!");
	}
}
