package com.fbaron.cvmanager.profile.core.domain;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.interactors.CreateProfileService;
import com.fbaron.cvmanager.profile.core.repositories.CreateProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class DomainCreateProfileService implements CreateProfileService {

    private final CreateProfileRepository createProfileRepository;

    @Override
    public Profile createProfile(Profile profile) {
        log.info("Received input for createProfile method with values profile: {}", profile);
        profile.setId(UUID.randomUUID().toString());
        var recordedProfile = createProfileRepository.createProfile(profile);
        log.info("Returning output for createProfile method with values recordedProfile: {}", recordedProfile);
        return recordedProfile;
    }

}
