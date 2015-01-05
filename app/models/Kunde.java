package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import play.*;
//import play.mvc.*;
//import views.html.*;
//import play.db.ebean.Model;
//import play.data.validation.Constraints;
//import play.data.*;

public class Kunde {

	public String kundenNummer;
	public String telefon;
	public boolean isAdmin;
	public String anrede;
	public String vorname;
	public String nachname;
	public String benutzername;
	public String email;
	public String email2;
	public String strasse;
	public String hausnummer;
	public String plz;
	public String ort;
	public String passwort;
	private List<Produkt> warenkorb = new ArrayList<>();
	
	

	public Kunde(String kundenNummer, String vorname, String anrede,
			String nachname, String username, String email, String strasse,
			String hausnummer, String plz, String ort, String telefonnummer,
			String passwort, boolean isAdmin) {
		this.kundenNummer = kundenNummer;
		this.anrede = anrede;
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzername = username;
		this.email = email;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
		this.telefon = telefonnummer;
		this.passwort = passwort;
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "KundenNummer:" + kundenNummer + ",\n"
				+ "Telefonnummer:" + telefon+ ",\n"
				+ "Adminrechte:" + isAdmin + ",\n"
				+ "Name:" + anrede + " " + vorname + " " +nachname + ",\n"
				+ "benutzername:"	+ benutzername + ",\n"
				+ "EMail-Adresse:" + email + ",\n"
				+ "Adresse: "+strasse+" "+hausnummer+", "+ plz +" "+ort;
	}

	public String getKundenNummer() {
		return kundenNummer;
	}

	public void setKundenNummer(String kundenNummer) {
		this.kundenNummer = kundenNummer;
	}

	public String getTelefonnummer() {
		return telefon;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefon = telefonnummer;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		this.benutzername = benutzername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public Kunde() {
		this.benutzername = "guest";
	}	// Standardkonstruktor

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public List<Produkt> getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Produkt produkt) {
		this.warenkorb.add(produkt);
	}
	
	public void clearWarenkorb(){
		this.warenkorb.clear();
	}
	
	public void updateWarenkorb(ArrayList<Produkt> produkte){
	
		for(Produkt produkt : produkte){
			if(this.warenkorb.contains(produkt)){
				this.warenkorb.add(produkt);
			}
			
		}
	}
	
	public void zeigeInhaltWarenkorb(){
		System.out.println("****** WARENKORB ************************************");
		for(Produkt produkt : this.warenkorb){
			System.out.println(produkt);
		}
		System.out.println("*****************************************************");
	}
	
	public void gibKundeAus(){
		System.out.println("******* KUNDENDATEN **********************************");
		this.toString();
		System.out.println("******************************************************");
	}

}
