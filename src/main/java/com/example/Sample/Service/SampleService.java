package com.example.Sample.Service;

import org.springframework.stereotype.Service;

import com.example.Sample.Entity.Sample;
import com.example.Sample.Repository.SampleRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SampleService implements SampleServiceInterface {
	private SampleRepository repo;
	
	public Sample saveData(Sample sample)
	{
		return repo.save(sample);
	}

}
