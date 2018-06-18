package com.timcoville.dojoninja.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.timcoville.dojoninja.models.Ninja;


@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long>{

}

