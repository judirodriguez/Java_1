package cl.generation.f202211022;

public class Administrativos extends CursoClasePadre {

	private String cargo;
	private int aniosDeExperiencia;

	public Administrativos() {
		super();
	}

	public Administrativos(String cargo, int aniosDeExperiencia) {
		super();
		this.cargo = cargo;
		this.aniosDeExperiencia = aniosDeExperiencia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}

	public void setAniosDeExperiencia(int aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}

	@Override
	public String toString() {
		return "Administrativos [cargo=" + cargo + ", aniosDeExperiencia=" + aniosDeExperiencia + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
    
}
