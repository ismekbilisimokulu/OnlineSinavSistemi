package com.ismek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ismek.domain.Kullanici;

@Repository
public interface KullaniciRespository extends CrudRepository<Kullanici, Integer>{
	
	Kullanici findByTcNoAndTelefon(@Param("tcNo") String tcNo,@Param("telefon") String telefon);

}
