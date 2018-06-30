package com.ismek.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ismek.domain.Kullanici;

@Repository
public interface KullaniciRespository extends CrudRepository<Kullanici, Integer>{

}
