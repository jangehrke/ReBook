package Control;

import View.BenutzerView;
import View.ProfilView;
import Model.Benutzer;
import Dao.BenutzerDao;
import Dao.JdbcConnectionSource;
import Model.Bewertung;
import Model.SupportKontakt;
import Model.Adresse;

public class BenutzerControl implements ActionListener {

	private SupportKontaktControl supportKontaktControl;

	private AdresseControl adreseeControl;

	private BewertungsControl bewertungsControl;

	private AngebotControl angebotControl;

	private ZahlungsInformationControl zahlugsInformationsControl;

	private BenutzerView benutzerView;

	private ProfilView profilView;

	private Benutzer benuzter;

	private BenutzerDao BenutzerControl;

	private ZahlungsInformationControl BenutzerControl;

	private BewertungsControl BentuzerControl;

	private SupportKontaktControl BenutzerControl;

	private AdresseControl BenutzerControl;

	private ZahlungsInformationControl zahlungsInformationControl;

	private JdbcConnectionSource jdbcConnectionSource;

	private JdbcConnectionSource jdbcConnectionSource;

	private Benutzer BenutzerControl;

	private BenutzerView BenutzerControl;

	private ProfilView profilView;

	public Bewertung benutzerBewerten(int Benutzer) {
		return null;
	}

	public SupportKontakt supportKontakttieren() {
		return null;
	}

	public Benutzer benutzerAendern() {
		return null;
	}

	public void buchKaufen() {

	}

	public void buchVerkaufen() {

	}

	public void passwortZurueksetzen() {

	}

	public void benutzerSperren(int Benutzer) {

	}

	public void benutzerFreigeben(int Benutzer) {

	}

	public void loescheKontakt() {

	}

	public void bewertungAnnehmen(Bewertung Bewertung) {

	}

	public void adresseHinzufügen(Adresse Adresse) {

	}

	public String akualisiereZahlungsstatus() {
		return null;
	}

}
