
public class Main {

	public static void main(String[] args) {
		Echipa HrTeam = new HrTeam("HrTeam",5);
		Echipa DevTeam = new DevTeam("DevTeam",5);
		
		Membru membru1 = new Membru("Popescu", "Ion", 23, 3000,5);
		Membru membru2 = new Membru("Lopescu", "Bogdan", 30, 5000,2);
		Membru membru3 = new Membru("Gor", "Alex", 40, 8000,10);
		Membru membru4 = new Membru("Luca", "Marian", 21, 2000,3);
		Membru membru5 = new Membru("Man", "Maria", 19, 1000,2);
		Membru membru6 = new Membru("Georgescu", "Mara", 23, 3000,2);
		
		System.out.println(HrTeam.setLider(membru1));
		HrTeam.addMember(membru2);
		HrTeam.addMember(membru3);
		HrTeam.addMember(membru4);
		//HrTeam.addMember(membru5);
		//HrTeam.addMember(membru6);
		
		System.out.println(HrTeam);
		
		HrTeam.removeMember(membru4);
		
		System.out.println("\n"+ HrTeam);
		System.out.println(HrTeam.getCost());
		
		Membru membruDev1 = new Membru("Nume1","prenume1",20,2000,2);
		Membru membruDev2 = new Membru("Nume2","prenume2",30,2000,5);
		Membru membruDev3 = new Membru("Nume3","prenume3",40,2000,10);
		Membru membruDev4 = new Membru("Nume4","prenume4",25,2000,3);
		Membru membruDev5 = new Membru("Nume5","prenume5",32,2000,1);
		
		DevTeam.addMember(membruDev5);
		DevTeam.addMember(membruDev4);
		DevTeam.addMember(membruDev1);
		DevTeam.addMember(membruDev2);
		DevTeam.addMember(membruDev3);
		
		DevTeam.setLider(membruDev3);
		
		System.out.println(DevTeam);
		System.out.println(DevTeam.getCost());
		
		DevTeam.setNumeEchipa("DevTeam1", membruDev5);
		DevTeam.setNumeEchipa("DevTeam1", membruDev3);
		DevTeam.setNumarMaximMembri(6, membruDev3);
		System.out.println(DevTeam);
		

		
		
		
		
		
		
		
		

	}


}
