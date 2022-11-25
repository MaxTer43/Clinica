package patron.builder;

import patron.builder.consulta.Paciente;
import patron.builder.consulta.Medico;
import patron.builder.consulta.Especialidad;

public class ConsultaBuilder {

	   public Consulta prepareConsulta (){
	      Consulta consulta = new Consulta();
	      //consulta.addItem(new Paciente());
	      //consulta.addItem(item);(new Medico());
	      //consulta.addItem(new Especialidad());
	      return consulta;
	   }   
}
