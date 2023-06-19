package com.fbaron.cvmanager.profile.data.mongo.mapper;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.data.mongo.document.ProfileDocument;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Mapper(componentModel = "spring")
public interface ProfileMongodbMapper {

    Profile documentToDomain(ProfileDocument document);

    ProfileDocument domainToDocument(Profile profile);

    List<Profile> documentListToDomainList(List<ProfileDocument> profileDocuments);

}
