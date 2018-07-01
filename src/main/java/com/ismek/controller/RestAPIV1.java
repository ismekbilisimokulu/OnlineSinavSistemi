package com.ismek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ismek.domain.Kullanici;
import com.ismek.repository.KullaniciRespository;
import com.ismek.util.Utils;

@RestController
@RequestMapping("/api/v1")
public class RestAPIV1 {
	
	@Autowired
	private KullaniciRespository kullaniciRepository;
	
	@RequestMapping(path="/kullanici", method=RequestMethod.GET)
    public ResponseEntity<List<Kullanici>> findAllKullanici() {
		Iterable<Kullanici> kullaniciIt = kullaniciRepository.findAll();
		List<Kullanici> list = Utils.toList(kullaniciIt);
		return new ResponseEntity<List<Kullanici>>(list,HttpStatus.OK);
    }
	
	@RequestMapping(path="/login/{tcNo}/{telefon}", method=RequestMethod.GET)
    public ResponseEntity<Kullanici> login(@PathVariable("tcNo") String tcNo, @PathVariable("telefon") String telefon) {
		Kullanici kullanici = kullaniciRepository.findByTcNoAndTelefon(tcNo,telefon);
		return new ResponseEntity<Kullanici>(kullanici,HttpStatus.OK);
    }

}
