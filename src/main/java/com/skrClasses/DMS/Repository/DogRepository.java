package com.skrClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.skrClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
