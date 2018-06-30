package com.ismek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Mulakat")
public class Mulakat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mulakat_id")
	private Integer mulakatId;
	
	@Column(name="m_sorulari")
	private String mulakatSorulari;
	
	public Integer getMulakatId() {
		return mulakatId;
	}
	public void setMulakatId(Integer mulakatId) {
		this.mulakatId = mulakatId;
	}
	public String getMulakatSorulari() {
		return mulakatSorulari;
	}
	public void setMulakatSorulari(String mulakatSorulari) {
		this.mulakatSorulari = mulakatSorulari;
	}
	
	
}
