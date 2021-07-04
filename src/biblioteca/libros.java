package biblioteca;

public class libros {
	String titulo;
	boolean original;
	boolean prestable;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setOriginal(boolean original) {
		this.original = original;
	}
	
	public boolean getOriginal() {
		return this.original;
	}
	public void setPrestable(boolean prestable) {
		this.prestable = prestable;
	}
	
	public boolean getPrestable() {
		return this.prestable;
	}
	
	public String esOriginal() {
		String original;
		if(this.original) {
			original = "es original";
		}else {
			original = "no es original";
		}
		return original;
	}
	
	public String sePresta() {
		String prestable;
		if(this.prestable) {
			prestable = " es prestable";
		}else {
			prestable = " no es prestable";
		}
		return prestable;
	}
	
}
