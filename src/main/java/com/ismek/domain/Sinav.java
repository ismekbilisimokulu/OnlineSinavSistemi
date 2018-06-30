package com.ismek.domain;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Sinav")
public class Sinav {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sinav_id")
	private Integer sinavId;
	
	@Column(name="sinav_adi")
	private String sinavAdi;
	
	@Column(name="sinav_tarihi")
	private Date sinavTarihi;
	
	@Column(name="sinav_suresi")
	private Time sinavSuresi;
	
	@Column(name="soru_sayisi")
	private Integer soruSayisi;
	
	@Column(name="bs_saati")
	private Time sinavSaati;
	
	@Column(name="sinav_salonu")
	private String sinavSalonu;
	
	@Column(name="katki_yuzdesi")
	private Float katkiYuzdesi;
	
	@Column(name="olusturma_tarihi")
	private Date olusturmaTarihi;
	
	@Column(name="is_aktif")
	private Boolean isAktif;
	
	@Column(name="brans_id")
	private Integer bransId;
	
	public Integer getSinavId() {
		return sinavId;
	}
	public void setSinavId(Integer sinavId) {
		this.sinavId = sinavId;
	}
	public String getSinavAdi() {
		return sinavAdi;
	}
	public void setSinavAdi(String sinavAdi) {
		this.sinavAdi = sinavAdi;
	}
	public Date getSinavTarihi() {
		return sinavTarihi;
	}
	public void setSinavTarihi(Date sinavTarihi) {
		this.sinavTarihi = sinavTarihi;
	}
	public Time getSinavSuresi() {
		return sinavSuresi;
	}
	public void setSinavSuresi(Time sinavSuresi) {
		this.sinavSuresi = sinavSuresi;
	}
	public Integer getSoruSayisi() {
		return soruSayisi;
	}
	public void setSoruSayisi(Integer soruSayisi) {
		this.soruSayisi = soruSayisi;
	}
	public Time getSinavSaati() {
		return sinavSaati;
	}
	public void setSinavSaati(Time sinavSaati) {
		this.sinavSaati = sinavSaati;
	}
	public String getSinavSalonu() {
		return sinavSalonu;
	}
	public void setSinavSalonu(String sinavSalonu) {
		this.sinavSalonu = sinavSalonu;
	}
	public Float getKatkiYuzdesi() {
		return katkiYuzdesi;
	}
	public void setKatkiYuzdesi(Float katkiYuzdesi) {
		this.katkiYuzdesi = katkiYuzdesi;
	}
	public Date getOlusturmaTarihi() {
		return olusturmaTarihi;
	}
	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}
	public Boolean getIsAktif() {
		return isAktif;
	}
	public void setIsAktif(Boolean isAktif) {
		this.isAktif = isAktif;
	}
	public Integer getBransId() {
		return bransId;
	}
	public void setBransId(Integer bransId) {
		this.bransId = bransId;
	}
	
	
}
