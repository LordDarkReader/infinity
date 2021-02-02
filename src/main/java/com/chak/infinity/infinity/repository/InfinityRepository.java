package com.chak.infinity.infinity.repository;

import com.chak.infinity.infinity.document.Infinity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfinityRepository extends MongoRepository<Infinity, String> {
}
