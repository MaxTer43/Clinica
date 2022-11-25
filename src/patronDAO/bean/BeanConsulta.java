package patronDAO.bean;

public class BeanConsulta {

	int id;
	String consultorio;
	String descripcion;
	String fecha;
	String estado;
	BeanPaciente paciente;
	BeanMedico medico;
	BeanEspecialidad especialidad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public BeanPaciente getPaciente() {
		return paciente;
	}
	public void setPaciente(BeanPaciente paciente) {
		this.paciente = paciente;
	}
	public BeanMedico getMedico() {
		return medico;
	}
	public void setMedico(BeanMedico medico) {
		this.medico = medico;
	}
	public BeanEspecialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(BeanEspecialidad especialidad) {
		this.especialidad = especialidad;
	}
}
