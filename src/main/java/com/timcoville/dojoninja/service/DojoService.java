package com.timcoville.dojoninja.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.timcoville.dojoninja.models.Dojo;
import com.timcoville.dojoninja.models.Ninja;
import com.timcoville.dojoninja.repositories.DojoRepo;
import com.timcoville.dojoninja.repositories.NinjaRepo;


@Service
public class DojoService {
	private final DojoRepo dojoRepo;
	private final NinjaRepo ninjaRepo;
	public DojoService(DojoRepo dojoRepo, NinjaRepo ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	
	public Dojo createDojo(Dojo record) {
		return dojoRepo.save(record);
	}
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	public Ninja createNinja(Ninja record) {
		return ninjaRepo.save(record);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> record = dojoRepo.findById(id);
		if (record.isPresent()) {
			return record.get();
		} else {
			return null;
		}
	}
	
}

