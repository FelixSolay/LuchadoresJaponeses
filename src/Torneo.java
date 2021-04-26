import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Torneo {
	private Luchador[] luchadores;

	public Torneo(Luchador[] luchadores) {
		this.luchadores = luchadores;
	}

	public Torneo(int cantLuchadores) {
		this.luchadores = new Luchador[cantLuchadores];
	}

	public void agregarLuchador(Luchador obj) {
		this.luchadores[luchadores.length - 1] = obj;
	}

	public Luchador[] getLuchadores() {
		return luchadores;
	}

	public void setLuchadores(Luchador[] luchadores) {
		this.luchadores = luchadores;
	}

	public void calcularDuelos() {
		try {
			File file = new File("Sumo.out");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			for (int i = 0; i < this.luchadores.length; i++) {
				for (int j = 0; j < this.luchadores.length; j++) {
					if (i != j && this.luchadores[i].dominaA(this.luchadores[j]))
						this.luchadores[i].dominados++;
				}
			}
			for (Luchador luchador : this.luchadores) {
				pw.println(luchador.dominados);
			}
			pw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
