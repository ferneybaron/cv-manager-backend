package com.fbaron.cvmanager.profile.data.jpa.mapper;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.data.jpa.entity.ProfileEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Mapper(componentModel = "spring")
public interface ProfileJpaMapper {

    Profile entityToDomain(ProfileEntity entity);

    ProfileEntity domainToEntity(Profile profile);

    //List<Contact> entityListToDomainList(List<ContactEntity> contactEntityList);

}
