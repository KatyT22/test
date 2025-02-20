package Templates;

import java.util.ArrayList;
import java.util.List;

public class Investor {
	

	private float capitalAInvestir;
	private List<Project> projetEnCours;
	private List<Project> projetArchive;

	public Investor(float capitalAInvestir) {
		super();
		this.capitalAInvestir = capitalAInvestir;
		projetEnCours = new ArrayList<>();
		projetArchive = new ArrayList<>();
	}

	public float getCapitalAInvestir() {
		return capitalAInvestir;
	}

	public void setCapitalAInvestir(float capitalInvesti) {
		this.capitalAInvestir = capitalInvesti;
	}

	public List<Project> getProjetEnCours() {
		return projetEnCours;
	}

	public void setProjetEnCours(List<Project> projetEnCours) {
		this.projetEnCours = projetEnCours;
	}

	public List<Project> getProjetArchive() {
		return projetArchive;
	}

	public void setProjetArchive(List<Project> projetArchive) {
		this.projetArchive = projetArchive;
	}
	
	public void showGetCapitalAInvestir(){
		System.out.println("Capital investisseur = "+capitalAInvestir);
	}
	
	public void addNewProjectEnCours(Project p){
		projetEnCours.add(p);
	}

}
