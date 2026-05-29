package com.example.Sample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Sample.Entity.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample,Integer>{

}
