package com.ismek.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Sorular")
public class Sorular {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="soru_id")
	private Integer soruId;
	
	@Column(name="soru")
	private String soru;
	
	@Column(name="secenekler")
	private String secenekler;
	
	@Column(name="secenek_sayisi")
	private String secenekSayisi;
	
	@Column(name="cevap")
	private String cevap;
	
	@Column(name="eklenme_tarihi")
	private Date eklenmeTarihi;
	
	@Column(name="soru_puan")
	private Integer soruPuan;
	
	@Column(name="is_onay")
	private Boolean isOnay;
	
	@Column(name="is_aktif")
	private Boolean isAktif;
	
	@Column(name="zorluk_seviye")
	private String zorlukSeviye;
	
	@Column(name="kullanici_id")
	private Integer kullaniciId;
	
	public Integer getSoruId() {
		return soruId;
	}
	public void setSoruId(Integer soruId) {
		this.soruId = soruId;
	}
	public String getSoru() {
		return soru;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}
	public String getSecenekler() {
		return secenekler;
	}
	public void setSecenekler(String secenekler) {
		this.secenekler = secenekler;
	}
	public String getSecenekSayisi() {
		return secenekSayisi;
	}
	public void setSecenekSayisi(String secenekSayisi) {
		this.secenekSayisi = secenekSayisi;
	}
	public String getCevap() {
		return cevap;
	}
	public void setCevap(String cevap) {
		this.cevap = cevap;
	}
	public Date getEklenmeTarihi() {
		return eklenmeTarihi;
	}
	public void setEklenmeTarihi(Date eklenmeTarihi) {
		this.eklenmeTarihi = eklenmeTarihi;
	}
	public Integer getSoruPuan() {
		return soruPuan;
	}
	public void setSoruPuan(Integer soruPuan) {
		this.soruPuan = soruPuan;
	}
	public Boolean getIsOnay() {
		return isOnay;
	}
	public void setIsOnay(Boolean isOnay) {
		this.isOnay = isOnay;
	}
	public Boolean getIsAktif() {
		return isAktif;
	}
	public void setIsAktif(Boolean isAktif) {
		this.isAktif = isAktif;
	}
	public String getZorlukSeviye() {
		return zorlukSeviye;
	}
	public void setZorlukSeviye(String zorlukSeviye) {
		this.zorlukSeviye = zorlukSeviye;
	}
	public Integer getKullaniciId() {
		return kullaniciId;
	}
	public void setKullaniciId(Integer kullaniciId) {
		this.kullaniciId = kullaniciId;
	}
	
}
