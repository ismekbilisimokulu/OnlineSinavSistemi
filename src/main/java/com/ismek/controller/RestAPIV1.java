package com.ismek.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RestAPIV1 {
	
	@RequestMapping(path="/test/{value}", method=RequestMethod.GET)
    public String test(@PathVariable("value") String value) {

        return "Sonuc : " + value;
    }

}
