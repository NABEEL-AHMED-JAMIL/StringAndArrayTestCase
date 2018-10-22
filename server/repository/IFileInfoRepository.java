package com.ballistic.server.repository;

import com.ballistic.server.pojo.geofencing.FileInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IFileInfoRepository extends MongoRepository<FileInfo,String> {
}
