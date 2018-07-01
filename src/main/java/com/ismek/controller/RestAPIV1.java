package com.ismek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Kullanici> findAllKullanici() {
		Iterable<Kullanici> kullaniciIt = kullaniciRepository.findAll();
		return Utils.toList(kullaniciIt);
    }

}
