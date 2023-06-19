package com.fbaron.cvmanager.profile.core.domain;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.interactors.GetProfileByIdService;
import com.fbaron.cvmanager.profile.core.repositories.FindProfileByIdRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class DomainGetProfileByIdService implements GetProfileByIdService {

    private final FindProfileByIdRepository profileByIdRepository;

    @Override
    public Profile getProfileById(String profileId) {
        log.info("Received input for getProfileById method with values profileId: {}", profileId);
        var profile = profileByIdRepository.findProfileById(profileId);
        log.info("Returning output for getProfileById method with values profile: {}", profile);
        return profile;
    }

}
