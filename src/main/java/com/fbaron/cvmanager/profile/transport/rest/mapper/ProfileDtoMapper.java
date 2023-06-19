package com.fbaron.cvmanager.profile.transport.rest.mapper;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.transport.rest.dto.CreateProfileDTO;
import com.fbaron.cvmanager.profile.transport.rest.dto.ProfileDTO;
import com.fbaron.cvmanager.profile.transport.rest.dto.UpdateProfileDTO;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/31/2023
 */

@Mapper(componentModel = "spring")
public interface ProfileDtoMapper {

    Profile dtoToDomain(CreateProfileDTO dto);

    Profile dtoToDomain(UpdateProfileDTO dto);

    ProfileDTO domainToDto(Profile profile);

    List<ProfileDTO> domainListToDtoList(List<Profile> profiles);

}
