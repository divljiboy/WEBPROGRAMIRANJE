package MODEL;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public User() {
		super();
	}
	public User(String user, String pass, String ime, String prezime, String uloga, String telefon, String email,
			String adresa, String drzava) {
		super();
		this.user = user;
		this.pass = pass;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.telefon = telefon;
		this.email = email;
		this.adresa = adresa;
		this.drzava = drzava;
	}
	String user;
	String pass;
	String ime;
	String prezime;
	String uloga;
	String telefon;
	String email;
	String adresa;
	String drzava;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getUloga() {
		return uloga;
	}
	public void setUloga(String uloga) {
		this.uloga = uloga;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

}
