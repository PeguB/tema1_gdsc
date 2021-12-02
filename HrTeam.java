
public class HrTeam extends Echipa {

	public HrTeam(String numeEchipa, int numarMaximMembri) {
		super(numeEchipa, numarMaximMembri);
	}

	@Override
	double getCost() {
		double cost;
		cost = 1350 + this.lider.getAniExperienta() * 300;
		cost += this.getCostMembers();
		return cost;
	}

	@Override
	double getCostMembers() {
			double cost = 0;
			for(Membru i : membri) {
				if(i.getAniExperienta() < 2) {
					cost += 1000;
				}
				else {
					if(i.getAniExperienta()>=2 && i.getAniExperienta() <= 5) {
						cost += 1000 + (double)(25*1000)/100;
					}
					else {
						cost += 1000 + (double)(50*1000)/100;
					}
				}
			}
			return cost;
		}

}
