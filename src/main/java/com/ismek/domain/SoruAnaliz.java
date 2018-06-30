package com.ismek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_SoruAnaliz")
public class SoruAnaliz {
	// Tüm kullanıcıların soruya verdiği cevapların analizi
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="analiz_id")
	private Integer analizId;
	
	@Column(name="dogru_sayisi")
	private Integer dSayisi;
	
	@Column(name="yanlis_sayisi")
	private Integer ySayisi;
	
	@Column(name="bos_sayisi")
	private Integer bSayisi;
	
	@Column(name="soru_id")
	private Integer soruId;
	
	public Integer getAnalizId() {
		return analizId;
	}
	public void setAnalizId(Integer analizId) {
		this.analizId = analizId;
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
	public Integer getSoruId() {
		return soruId;
	}
	public void setSoruId(Integer soruId) {
		this.soruId = soruId;
	}
	
	
}
