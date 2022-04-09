package codigofuente;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
	public static ArrayList<Empleado> Lista_empleado = new ArrayList<Empleado>();

	public static ArrayList<Transportista> Lista_transportista = new ArrayList<Transportista>();

	public static ArrayList<Transporte> Lista_transporte = new ArrayList<Transporte>();

	public static ArrayList<Semillas> Lista_semillas = new ArrayList<Semillas>();

	public static ArrayList<Factura> Lista_factura = new ArrayList<Factura>();

	public Administrador() {
		// SUPER-CLASE Lo que se vaya a ejecutar sin necesidad de ordenarselo
		// manualmente
	}

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		Scanner TecladoE = new Scanner(System.in);
		Scanner TecladoTs = new Scanner(System.in);
		Scanner TecladoS = new Scanner(System.in);
		Scanner TecladoT = new Scanner(System.in);
		Scanner TecladoF = new Scanner(System.in);

		// Generaremos un ciclo que permita manipular
		// los objetos y la informacion que daremos de alta
		int opc = 0; // Variable que permita capturar la información
		// Variables de
		String Nombre1 = "";
		String Nombre2 = "";
		String Nombre4 = "";
		String ApellidoP1 = "";
		String ApellidoM1 = "";
		String ApellidoP2 = "";
		String ApellidoM2 = "";
		String CurpEmpl = "";
		String CurpTran = "";

		Float salario;
		String hora_entrada ="";
		String hora_salida ="";

		// Variables de transportista
		String tipo_licencia = "";

		// Variables de Transporte
		String placas = "";
		String num_serie = "";
		String color = "";
		int num_ejes = 0;
		int modelo = 0;
		String marca = "";

		// Variables de Factura
		String variedad = "";
		int humedad = 0;
		int idsemilla = 0;
		int folio = 0;
		int fecha = 0;
		String tipoS = "";
		int pesoT = 0;
		String idempleado = "";
		String idtrans = "";
		String placasc = "";

		do {
			System.out.println("Dame una opcion a realizar");
			System.out.println("1.- Capturar un Empleado");
			System.out.println("2.- Capturar Transportista");
			System.out.println("3.- Capturar transporte");
			System.out.println("4.- Capturar semilla");
			System.out.println("0.- Salir");
			opc=Teclado.nextInt();
			
			switch (opc) {
			case 1:
				Empleado ObjetoEmpleado = new Empleado();
				System.out.println("Se captura el empleado");
				Nombre1 = TecladoE.nextLine();
				ObjetoEmpleado.setNombre(Nombre1);
				System.out.println("Captura el salario del empleado");
				salario = TecladoE.nextFloat();
				ObjetoEmpleado.setSalario(salario);
				System.out.println("Captura la hora de entrada del empleado");
				hora_entrada = TecladoE.nextLine();
				ObjetoEmpleado.setHora_entrada(hora_entrada);
				System.out.println("Captura la hora de salida del empleado");
				hora_salida = TecladoE.nextLine();
				ObjetoEmpleado.setSalario(salario);

				Lista_empleado.add(ObjetoEmpleado);
				break;

			case 2:
				Transportista ObjetoTransportista = new Transportista();
				System.out.println("Captura el transportista: ");
				Nombre2 = Teclado.nextLine();
				ObjetoTransportista.setNombre(Nombre2);
				System.out.println("Captura el tipo de licencia del transportista");
				tipo_licencia = TecladoTs.nextLine();
				ObjetoTransportista.setTipo_licencia(tipo_licencia);

				Lista_transportista.add(ObjetoTransportista);
				break;

			case 3:
				Transporte ObjetoTransporte = new Transporte();
				System.out.println("Ingrese las placas del camión: ");
				placas = TecladoT.nextLine();
				ObjetoTransporte.setPlacas(placas);
				System.out.println("Ingrese el numero de serie del camión: ");
				num_serie = TecladoT.nextLine();
				ObjetoTransporte.setNum_serie(num_serie);
				System.out.println("Ingrese el color del camión: ");
				color = TecladoT.nextLine();
				ObjetoTransporte.setColor(color);
				System.out.println("Ingrese el numero de ejes del camión: ");
				num_ejes = TecladoT.nextInt();
				ObjetoTransporte.setNum_ejes(num_ejes);
				System.out.println("Ingrese el modelo del camión: ");
				modelo = TecladoT.nextInt();
				ObjetoTransporte.setModelo(modelo);
				System.out.println("Ingrese la marca del camión: ");
				marca = TecladoT.nextLine();
				ObjetoTransporte.setMarca(marca);

				Lista_transporte.add(ObjetoTransporte);
				break;

			case 4:
				Semillas ObjetoSemillas = new Semillas();
				System.out.println("Ingrese el id de la semilla: ");
				Nombre4 = TecladoS.nextLine();
				ObjetoSemillas.setIdsemilla(idsemilla);
				System.out.println("Ingrese el nombre de la semilla: ");
				Nombre4 = TecladoS.nextLine();
				ObjetoSemillas.setNombre(Nombre4);
				System.out.println("Ingrese la variedad de la semilla: ");
				variedad = TecladoS.nextLine();
				ObjetoSemillas.setVariedad(variedad);
				System.out.println("Ingrese la humedad que  tiene la semilla: ");
				humedad = TecladoS.nextInt();
				ObjetoSemillas.setHumedad(humedad);

				Lista_semillas.add(ObjetoSemillas);
				break;

			case 5:
				Factura ObjetoFactura = new Factura();
				System.out.println("Ingrese el folio de la factura");
				folio = TecladoF.nextInt();
				ObjetoFactura.setFolio(folio);
				System.out.println("Captura la fecha del dia de recibo");
				fecha = TecladoF.nextInt();
				ObjetoFactura.setFecha(fecha);
				System.out.println("Ingrese el tipo de semilla");
				tipoS = TecladoF.nextLine();
				ObjetoFactura.setTipoS(tipoS);
				System.out.println("Captura el total del peso entregado:");
				pesoT = TecladoF.nextInt();
				ObjetoFactura.setPeso(pesoT);
				System.out.println("Captura la humedad de la semilla");
				humedad = TecladoF.nextInt();
				ObjetoFactura.setHumedad(humedad);
				System.out.println("Ingrese el id empleado que recibio el producto: ");
				idempleado = TecladoF.nextLine();

				boolean valiares = ValidaEmpelado(idempleado, Lista_empleado);

				if (valiares == true) {
					ObjetoFactura.setEmpleado(idempleado);
					System.out.println("Captura al transportista que entrego: ");
					idtrans = TecladoF.nextLine();
					ObjetoFactura.setTransportista(idtrans);
					System.out.println("Captura la placa del transporte: ");
					placasc = TecladoF.nextLine();
					ObjetoFactura.setPlacasc(placasc);

					Lista_factura.add(ObjetoFactura);
				} else {
					System.out.print("El empleado no existe");
				}

				System.out.println(opc);
			default:
				System.out.println("Opcion no Valida");
				break;
			}

		} while (opc != 0);

	}// llave de main

	public static boolean ValidaEmpelado(String idempleado, ArrayList<Empleado> LisEmpl) {
		boolean Resultado = false;
		for (int x = 0; x < LisEmpl.size(); x++) {
			if (LisEmpl.get(x).getIdempl() == idempleado) {
				Resultado = true;
			}
		}
		return Resultado;

	}

	public static boolean ValidaTransportista(String idtransportista, ArrayList<Transportista> LisTrans) {
		boolean Resultado = false;
		for (int x = 0; x < LisTrans.size(); x++) {
			if (LisTrans.get(x).getIdtrans() == idtransportista) {
				Resultado = true;
			}
		}
		return Resultado;

	}

	public static boolean ValidaTransporte (String placas, ArrayList<Transporte> ListTR) {
		boolean Resultado=false;
		for(int x=0;x<ListTR.size();x++) {
			if (ListTR.get(x).getPlacas()==placas) {
				Resultado=true;
			}
		}	
		return Resultado;
		
	}

	public static boolean ValidaSemilla (int Idsemilla, ArrayList<Semillas> ListSemilla ) {
		boolean Resultado=false;
		for(int x=0;x<ListSemilla.size();x++) {
			if (ListSemilla.get(x).getIdsemilla()==Idsemilla) {
				Resultado=true;
			}
		}	
		return Resultado;
		
	}



	
}
// llave de clase
