package entities.json;

public class ChiffreAffaire {
	
	private String annee;
	private double chiffreEnmilliardsDe$;
	
	
	@Override
	public String toString() {
		return "En " + annee + " => " + chiffreEnmilliardsDe$ + " miliards de $";
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public double getChiffreEnmilliardsDe$() {
		return chiffreEnmilliardsDe$;
	}
	public void setChiffreEnmilliardsDe$(double chiffreEnmilliardsDe$) {
		this.chiffreEnmilliardsDe$ = chiffreEnmilliardsDe$;
	}

}
