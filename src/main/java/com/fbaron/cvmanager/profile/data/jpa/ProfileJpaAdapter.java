package com.fbaron.cvmanager.profile.data.jpa;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.repositories.CreateProfileRepository;
import com.fbaron.cvmanager.profile.data.jpa.mapper.ProfileJpaMapper;
import com.fbaron.cvmanager.profile.data.jpa.repository.ProfileJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Slf4j
@RequiredArgsConstructor
public class ProfileJpaAdapter implements CreateProfileRepository {

    private final ProfileJpaRepository profileJpaRepository;
    private final ProfileJpaMapper profileJpaMapper;

    /**
     * Creates a new profile with the provided profile details in the repository.
     *
     * @param profile The profile to be created.
     * @return The created {@link Profile} object with a unique identifier.
     */
    @Override
    public Profile createProfile(Profile profile) {
        log.info("Received input for createProfile method with values profile: {}", profile);
        var profileEntity = profileJpaMapper.domainToEntity(profile);
        profileEntity = profileJpaRepository.save(profileEntity);
        var profileRecorded = profileJpaMapper.entityToDomain(profileEntity);
        log.info("Returning output for createProfile method with values profileRecorded: {}", profileRecorded);
        return profileRecorded;
    }

}
