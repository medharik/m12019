
public class JetSki {
private int numeroJetSki;
private Date dateMiseEnService;
private String couleur;
public int getNumeroJetSki() {
	return numeroJetSki;
}
public void setNumeroJetSki(int numeroJetSki) {
	this.numeroJetSki = numeroJetSki;
}
public Date getDateMiseEnService() {
	return dateMiseEnService;
}
public void setDateMiseEnService(Date dateMiseEnService) {
	this.dateMiseEnService = dateMiseEnService;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public JetSki() {

}
public JetSki(int numeroJetSki, Date dateMiseEnService, String couleur) {
	super();
	this.numeroJetSki = numeroJetSki;
	this.dateMiseEnService = dateMiseEnService;
	this.couleur = couleur;
}
@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}

}
