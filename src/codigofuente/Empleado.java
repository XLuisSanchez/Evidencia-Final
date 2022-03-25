package codigofuente;

import java.sql.Time;

public class Empleado extends Personas {

	public static float salario;
	public static Time hora_entrada;
	public static Time hora_salida;

	public static float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		Empleado.salario = salario;
	}

	public static Time getHora_entrada() {
		return hora_entrada;
	}

	public static void setHora_entrada(Time hora_entrada) {
		Empleado.hora_entrada = hora_entrada;
	}

	public static Time getHora_salida() {
		return hora_salida;
	}

	public static void setHora_salida(Time hora_salida) {
		Empleado.hora_salida = hora_salida;
	}

}
