import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GestorArchivos {

	public static Torneo leerArchivo(String nArch) {
		Torneo tor = null;
		try {
			File file = new File(nArch);
			Scanner scan = new Scanner(file);
			int cantLuchadores = Integer.parseInt(scan.nextLine());
			Luchador luchadores[] = new Luchador[cantLuchadores];
			for (int i = 0; i < cantLuchadores; i++) {
				String datos[] = (scan.nextLine()).split(" ");
				luchadores[i] = new Luchador(Double.parseDouble(datos[0]), Double.parseDouble(datos[1]));
			}
			tor = new Torneo(luchadores);
			scan.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return tor;
	}
}
