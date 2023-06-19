package com.fbaron.cvmanager.profile.core.domain;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.interactors.UpdateProfileService;
import com.fbaron.cvmanager.profile.core.repositories.UpdateProfileRepository;
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
public class DomainUpdateProfileService implements UpdateProfileService {

    private final UpdateProfileRepository updateProfileRepository;

    @Override
    public Profile updateProfile(String profileId, Profile profile) {
        log.info("Received input for updateProfile method with values profileId: {}, profile: {}", profileId, profile);
        profile.setId(UUID.randomUUID().toString());
        var recordedProfile = updateProfileRepository.updateProfile(profileId, profile);
        log.info("Returning output for updateProfile method with values recordedProfile: {}", recordedProfile);
        return recordedProfile;
    }

}
