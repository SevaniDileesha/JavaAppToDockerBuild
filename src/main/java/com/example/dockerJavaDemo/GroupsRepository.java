package com.example.dockerJavaDemo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository extends CrudRepository<Groups, Integer> {

	List<Groups> findAll();
}
