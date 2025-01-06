package com.murilodias.workshopmongodb.repository;

import com.murilodias.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {


}