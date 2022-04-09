package codigofuente;

public class Semillas {

	public static int idsemilla;
	public static String nombre;
	public static String variedad;
	public static int humedad;
	public static int peso;

	public static int getPeso() {
		return peso;
	}

	public static void setPeso(int peso) {
		Semillas.peso = peso;
	}

	public static String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		Semillas.nombre = nombre;
	}

	public  String getVariedad() {
		return variedad;
	}

	public  void setVariedad(String variedad) {
		Semillas.variedad = variedad;
	}

	public  int getHumedad() {
		return humedad;
	}

	public  void setHumedad(int humedad) {
		Semillas.humedad = humedad;
		
	}

	public int getIdsemilla() {
		return idsemilla;
	}

	public void setIdsemilla(int idsemilla) {
		Semillas.idsemilla = idsemilla;
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
