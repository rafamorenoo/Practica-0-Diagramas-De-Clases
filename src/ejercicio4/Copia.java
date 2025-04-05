package ejercicio4;

public class Copia {

	private int id_copia;

	private enum Tipo_Estado {

		Prestada, EnBiblioteca, Retraso, Reparación;
	}

	private Tipo_Estado estado;

	public Copia(int id_copia, Tipo_Estado estado) {

		this.id_copia = id_copia;
		this.estado = estado;
	}

	public void prestar() {

	}

}
