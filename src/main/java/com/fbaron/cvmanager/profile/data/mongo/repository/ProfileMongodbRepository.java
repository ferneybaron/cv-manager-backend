package com.fbaron.cvmanager.profile.data.mongo.repository;

import com.fbaron.cvmanager.profile.data.mongo.document.ProfileDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Repository
public interface ProfileMongodbRepository extends MongoRepository<ProfileDocument, String> {
}
