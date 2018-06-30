package com.ismek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Brans")
public class Brans {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="brans_id")
	private Integer bransId;
	
	@Column(name="brans_adi")
	private String bransAdi;
	
	@Column(name="kontenjan")
	private Integer kontenjan;
	
	public Integer getBransId() {
		return bransId;
	}
	public void setBransId(Integer bransId) {
		this.bransId = bransId;
	}
	public String getBransAdi() {
		return bransAdi;
	}
	public void setBransAdi(String bransAdi) {
		this.bransAdi = bransAdi;
	}
	public Integer getKontenjan() {
		return kontenjan;
	}
	public void setKontenjan(Integer kontenjan) {
		this.kontenjan = kontenjan;
	}
	
}
