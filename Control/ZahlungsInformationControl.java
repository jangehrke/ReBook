package Control;

import View.ZahlungsInformationView;
import Model.ZahlungsInformation;
import Dao.ZahlungsInformationDao;
import Dao.JdbcConnectionSource;
import Dao.KlarnaDao;
import Dao.PaypalDao;
import Dao.RechnungDao;
import Dao.KreditKartenDao;
import Dao.UeberweisungDao;

public class ZahlungsInformationControl {

	private ZahlungsInformationView zahlungsInformationView;

	private ZahlungsInformation zahlungsInformation;

	private ZahlungsInformationDao ZahlungInformationControl;

	private JdbcConnectionSource jdbcConnectionSource;

	private BenutzerControl benutzerControl;

	private ZahlungsInformation ZahlungInformationControl;

	private ZahlungsInformationView ZahlungInformationControl;

	private KlarnaDao ZahlungInformationControl;

	private PaypalDao ZahlungInformationControl;

	private RechnungDao ZahlungInformationControl;

	private KreditKartenDao ZahlungsInformationControl;

	private UeberweisungDao ZahlungsInformationControl;

	public void zahlungsInformationAendern() {

	}

	public boolean rechnungBeglichen() {
		return false;
	}

	public void zahlungsMethodeEinstellen() {

	}

}
