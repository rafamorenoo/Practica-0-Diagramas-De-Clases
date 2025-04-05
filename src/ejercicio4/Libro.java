package ejercicio4;

public class Libro {

	private String titulo;

	private enum tipo_libro {

		Novela, Teatro, Poesía, Ensayo;
	}

	private tipo_libro tipo;

	private String editorial;
	private int año;
	private int ISBN;

	public Libro(String titulo, tipo_libro tipo, String editorial, int año, int ISBN) {

		this.titulo = titulo;
		this.tipo = tipo;
		this.editorial = editorial;
		this.año = año;
		this.ISBN = ISBN;
	}

	public String getNombreAutor() {
		return "";
	}

}
