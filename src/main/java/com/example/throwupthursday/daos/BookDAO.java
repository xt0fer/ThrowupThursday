package com.example.throwupthursday.daos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookDAO extends PagingAndSortingRepository<Book, Long> {
}
