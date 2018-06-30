package com.ismek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Sinav_Sonuc")
public class SinavSonuc {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_sonuc_id")
	private Integer sonucId;
	
	@Column(name="d_sayisi")
	private Integer dSayisi;
	
	@Column(name="y_sayisi")
	private Integer ySayisi;
	
	@Column(name="bos_sayisi")
	private Integer bSayisi;
	
	@Column(name="son_puan")
	private Integer sonPuan;
	
	@Column(name="kts_id")
	private Integer ktsId;

	public Integer getSonucId() {
		return sonucId;
	}

	public void setSonucId(Integer sonucId) {
		this.sonucId = sonucId;
	}

	public Integer getdSayisi() {
		return dSayisi;
	}

	public void setdSayisi(Integer dSayisi) {
		this.dSayisi = dSayisi;
	}

	public Integer getySayisi() {
		return ySayisi;
	}

	public void setySayisi(Integer ySayisi) {
		this.ySayisi = ySayisi;
	}

	public Integer getbSayisi() {
		return bSayisi;
	}

	public void setbSayisi(Integer bSayisi) {
		this.bSayisi = bSayisi;
	}

	public Integer getSonPuan() {
		return sonPuan;
	}

	public void setSonPuan(Integer sonPuan) {
		this.sonPuan = sonPuan;
	}

	public Integer getKtsId() {
		return ktsId;
	}

	public void setKtsId(Integer ktsId) {
		this.ktsId = ktsId;
	}
	
	
}
