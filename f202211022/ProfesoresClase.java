package cl.generation.f202211022;

public class ProfesoresClase extends CursoClasePadre {

	private String ramo;
	private String especialidad;

	public ProfesoresClase() {
		super();
	}

	public ProfesoresClase(String ramo, String especialidad) {
		super();
		this.ramo = ramo;
		this.especialidad = especialidad;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "ProfesoresClase [ramo=" + ramo + ", especialidad=" + especialidad + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

}
