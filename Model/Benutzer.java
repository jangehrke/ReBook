package Model;

public class Benutzer {

	private int benutzerId;

	private String emailAdresse;

	private String passwort;

	private byte Profilbild;

	private String name;

	private List<Adresse> adresse;

	private String telefonNr;

	private ZahlungsInformation zahlungsInfo;

	private boolean gesperrt;

	private LocalDateTime laengeSperre;

	private String grundSperre;

	private String rolle;

	private List<Angebot> angebote;

	private List<Bewertung> bewertungen;

	private List<SupportKontakt> suportKontakte;

	public int getBenutzerId() {
		return 0;
	}

	public void setBenutzerId(int id) {

	}

	public String getEmailAdresse() {
		return null;
	}

	public void setEmailAdresse(String email) {

	}

	public String getPasswort() {
		return null;
	}

	public void setPasswort(String passwort) {

	}

	public String getName() {
		return null;
	}

	public void setName(String name) {

	}

	public byte getProfilbild() {
		return 0;
	}

	public void setProfilbild(byte bild) {

	}

	public Adresse getAdresse() {
		return null;
	}

	public void setAdresse(Adresse adresse) {

	}

	public String getTelefonnummer() {
		return null;
	}

	public void setTelefonnummer(String telefonnummer) {

	}

	public ZahlungsInformation getZahlungsInformation() {
		return null;
	}

	public void setZahlungsInforamtion(ZahlungsInformation zahlungsInformation) {

	}

	public boolean getGesperrt() {
		return false;
	}

	public void setGesperrt(boolean status) {

	}

	public LocalDateTime getlaengeSperre() {
		return null;
	}

	public void setlaengeSperre(LocalDateTime laengeDerSperre) {

	}

	public String getGrundSperre() {
		return null;
	}

	public void setGrundSperre(String grundDerSperre) {

	}

	public String getRolle() {
		return null;
	}

	public void setRolle(String rolle) {

	}

	public List<Angebot> getAngebote() {
		return null;
	}

	public List<Bewertung> getBewertungen() {
		return null;
	}

	public List<SupportKontakt> getsupportKontakt() {
		return null;
	}

}
