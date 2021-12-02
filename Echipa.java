import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Echipa {
	protected Membru lider;
	private String numeEchipa;
	private int numarMaximMembri;
	protected ArrayList<Membru> membri = new ArrayList<>();
	public Echipa(String numeEchipa, int numarMaximMembri) {
		this.numeEchipa = numeEchipa;
		this.numarMaximMembri = numarMaximMembri;
	}
	public boolean addMember(Membru member) {
		if(membri.size() <= numarMaximMembri) {
			membri.add(member);
			return true;
		}
		return false;
	}
	public boolean setLider(Membru membruParametru) {
		if(membruParametru.getAniExperienta() < 5 ){
			return false;	
		}
		else {
			
			if(membri.contains(membruParametru) == true) {
				this.lider = membruParametru;
				
			}else {
				this.lider = membruParametru;
				this.addMember(membruParametru);
			}
			return true;
		}
		
	}
	public Membru removeMember(Membru member) {
		for(Membru i : membri) {
			if(membri.contains(member)) {
				membri.remove(member);
				return member;
			}
		}
			return null;
	}
	@Override
	public String toString() {
		String aux = "Nume echipa: " + this.numeEchipa +"\n";
		aux += "Lider echipa :<" + this.lider.getNume() + ">-<" + this.lider.getPrenume() + ">\n";
		for(Membru i : membri) {
			aux += i + "\n";
		}
		return aux;		
	}
	
	public void setNumarMaximMembri(int numarMaximMembri, Membru member) {
		if(member.equals(this.lider)) {
			//cand setez un numar mai mic de membri 
			//vreau sa sterg memmbri cu anii de experienta cei mai putini
			if(this.numarMaximMembri > numarMaximMembri) {
				List <Membru> buff = membri.stream()
								.sorted(Comparator.comparing(Membru::getAniExperienta))
								.skip(this.numarMaximMembri - numarMaximMembri)
								.collect(Collectors.toList());
				
				membri.clear();
				membri.addAll(buff);
				this.numarMaximMembri = numarMaximMembri;
				
				
				
			}
			else {
				this.numarMaximMembri = numarMaximMembri;
			}
		}
		else {
			System.out.println("Un membru nu poate umbla la datele echipei");
		}
		
	}
	public void setNumeEchipa(String numeEchipa, Membru member) {
		if(member.equals(this.lider)) {
			this.numeEchipa = numeEchipa;
		}
		else {
			System.out.println("Un membru nu poate umbla la datele echipei");
		}
	}
	abstract double getCost();
	abstract double getCostMembers();
}
