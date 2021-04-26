
public class Main {

	public static void main(String[] args) {
		Torneo torneo = GestorArchivos.leerArchivo("Sumo.in");
		torneo.calcularDuelos();

	}

}
