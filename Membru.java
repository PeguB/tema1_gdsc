import java.util.Objects;

public class Membru {
	private String nume;
	private String prenume;
	private int varsta;
	private int salariu;
	int aniExperienta;
	public Membru(String nume, String prenume, int varsta, int salariu, int aniExperienta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.salariu = salariu;
		this.aniExperienta = aniExperienta;
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Membru))
			return false;
		Membru other = (Membru) obj;
		return aniExperienta == other.aniExperienta 
				&& Objects.equals(nume, other.nume) && Objects.equals(prenume, other.prenume)
				&& salariu == other.salariu && varsta == other.varsta;
	}






	@Override
	public String toString() {
		return "Membru [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", salariu=" + salariu
				+ ", aniExperienta=" + aniExperienta + "]";
	}
	public String getNume() {
		return nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public int getAniExperienta() {
		return aniExperienta;
	}
	
	
	
}
