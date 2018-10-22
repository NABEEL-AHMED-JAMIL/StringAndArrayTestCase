package com.ballistic.server.repository;

import com.ballistic.server.pojo.geofencing.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAccountRepository extends MongoRepository<Account,String> {
}
