package codigofuente;

public class Empleado extends Personas {

	public static String idempl;
	public String getIdempl() {
		return idempl;
	}

	public  void setIdempl(String idempl) {
		Empleado.idempl = idempl;
	}

	public static float salario;
	public static String hora_entrada;
	public static String hora_salida;

	public  float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		Empleado.salario = salario;
	}

	public  String getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(String hora_entrada) {
		Empleado.hora_entrada = hora_entrada;
	}

	public  String getHora_salida() {
		return hora_salida;
	}

	public  void setHora_salida(String hora_salida) {
		Empleado.hora_salida = hora_salida;
	}

}
