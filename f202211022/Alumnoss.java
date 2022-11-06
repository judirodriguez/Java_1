package cl.generation.f202211022;

public class Alumnoss extends CursoClasePadre {

	private String genero;
	private int numerodelista;
	public Alumnoss() {
		super();
	}
	public Alumnoss(String genero, int numerodelista) {
		super();
		this.genero = genero;
		this.numerodelista = numerodelista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNumerodelista() {
		return numerodelista;
	}
	public void setNumerodelista(int numerodelista) {
		this.numerodelista = numerodelista;
	}
	@Override
	public String toString() {
		return "Alumnoss [genero=" + genero + ", numerodelista=" + numerodelista + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
    
	
}
