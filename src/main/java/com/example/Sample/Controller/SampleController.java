package com.example.Sample.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sample.Entity.Sample;
import com.example.Sample.Service.SampleServiceInterface;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class SampleController {
	
	private SampleServiceInterface service;
	
	@PostMapping("/add")
	public Sample add(@RequestBody Sample sample)
	{
		return service.saveData(sample);
	}

}
