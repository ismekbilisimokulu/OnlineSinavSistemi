package com.ismek.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Mulakat_Cevaplari")
public class MulakatCevap {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="m_cevap_id")
	private Integer mCevapId;
	
	@Column(name="cevap")
	private String cevap;
	
	@Column(name="kts_id")
	private Integer ktsId;
	
	@Column(name="mulakat_id")
	private Integer mulakatId;

	public Integer getmCevapId() {
		return mCevapId;
	}

	public void setmCevapId(Integer mCevapId) {
		this.mCevapId = mCevapId;
	}

	public String getCevap() {
		return cevap;
	}

	public void setCevap(String cevap) {
		this.cevap = cevap;
	}

	public Integer getKtsId() {
		return ktsId;
	}

	public void setKtsId(Integer ktsId) {
		this.ktsId = ktsId;
	}

	public Integer getMulakatId() {
		return mulakatId;
	}

	public void setMulakatId(Integer mulakatId) {
		this.mulakatId = mulakatId;
	}
	
	
}
