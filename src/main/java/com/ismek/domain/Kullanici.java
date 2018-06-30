package com.ismek.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Kullanici")
public class Kullanici {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kullanici_id")
	private Integer kullaniciId;
	
	@Column(name="tc_no")
	private String tcNo;
	
	@Column(name="adi")
	private String adi;
	
	@Column(name="soyadi")
	private String soyadi;
	
	@Column(name="telefon")
	private String telefon;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="dogum_tarihi")
	private Date dogumTarihi;
	
	@Column(name="cinsiyet")
	private String cinsiyet;
	
	public Integer getKullaniciId() {
		return kullaniciId;
	}
	public void setKullaniciId(Integer kullaniciId) {
		this.kullaniciId = kullaniciId;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	

}
