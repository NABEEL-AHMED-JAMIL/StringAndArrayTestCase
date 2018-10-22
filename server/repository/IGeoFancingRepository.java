package com.ballistic.server.repository;

import com.ballistic.server.pojo.geofencing.Geofencing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IGeoFancingRepository extends MongoRepository<Geofencing, String> {
}
