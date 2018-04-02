package com.example.throwupthursday.daos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// DAO Person

@Repository
@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonDAO extends PagingAndSortingRepository<Person, Long> {
}
