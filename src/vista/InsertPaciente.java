package vista;

import java.util.Scanner;

import patronDAO.adminDAO.DAOFactory;
import patronDAO.adminDAO.PacienteDAO;
import patronDAO.bean.BeanPaciente;

public class InsertPaciente {

	public static void main(String[] args) {
		BeanPaciente bean = new BeanPaciente();
		DAOFactory factory = DAOFactory.getDAOFactory(4);
		PacienteDAO dao = factory.getPacienteDAO();
		
	
		String nombres;
		String apellidos;
		String fechaNacimiento;
		String sexo;
		String direccion;
		String correo;
		int telefono;
		int dni;
		float peso;
		float talla;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese nombres: ");			
		nombres =teclado.nextLine();
		
		System.out.print("Ingrese apellidos: ");			
		apellidos =teclado.nextLine();
		
		System.out.print("Ingrese fecha de nacimiento: ");			
		fechaNacimiento =teclado.nextLine();
		
		System.out.print("Ingrese sexo: ");			
		sexo =teclado.nextLine();
		
		System.out.print("Ingrese direccion: ");			
		direccion =teclado.nextLine();
		
		System.out.print("Ingrese correo: ");			
		correo =teclado.nextLine();
		
		System.out.print("Ingrese telefono: ");			
		telefono =teclado.nextInt();
		
		System.out.print("Ingrese dni: ");			
		dni =teclado.nextInt();
		
		System.out.print("Ingrese peso: ");			
		peso =teclado.nextFloat();
		
		System.out.print("Ingrese talla: ");			
		talla =teclado.nextFloat();
		
	
		bean.setNombres(nombres);
		bean.setApellidos(apellidos);
		bean.setFechaNacimiento(fechaNacimiento);
		bean.setSexo(sexo);
		bean.setDireccion(direccion);
		bean.setCorreo(correo);
		bean.setTelefono(telefono);
		bean.setDni(dni);
		bean.setPeso(peso);
		bean.setTalla(talla);
		
		dao.InsertPaciente(bean);
		System.out.println(bean + "¡Se insertó!");
	}
}
