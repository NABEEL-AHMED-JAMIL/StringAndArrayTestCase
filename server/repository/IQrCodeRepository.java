package com.ballistic.server.repository;

import com.ballistic.server.pojo.geofencing.QrCode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IQrCodeRepository extends MongoRepository<QrCode,String> {
}
