
public class DevTeam extends Echipa {

	public DevTeam(String numeEchipa, int numarMaximMembri) {
		super(numeEchipa, numarMaximMembri);
	}

	@Override
	double getCost() {
		double cost;
		cost = 2500 + this.lider.getAniExperienta();
		cost += this.getCostMembers();
		return cost;
	}
	protected double getCostMembers() {
		double cost = 0;
		for(Membru i : membri) {
			if(i.getAniExperienta() < 2) {
				cost += 1500;
			}
			else {
				if(i.getAniExperienta()>=2 && i.getAniExperienta() <= 5) {
					cost += 1500 + (double)(25*1500)/100;
				}
				else {
					cost += 1500 + (double)(50*1500)/100;
				}
			}
		}
		return cost;
	}
	
}
