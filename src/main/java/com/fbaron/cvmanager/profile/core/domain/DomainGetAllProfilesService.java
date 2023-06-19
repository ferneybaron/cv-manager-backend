package com.fbaron.cvmanager.profile.core.domain;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.interactors.GetAllProfilesService;
import com.fbaron.cvmanager.profile.core.repositories.CreateProfileRepository;
import com.fbaron.cvmanager.profile.core.repositories.FindAllProfilesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class DomainGetAllProfilesService implements GetAllProfilesService {

    private final FindAllProfilesRepository findAllProfilesRepository;

    @Override
    public List<Profile> getAllProfiles() {
        log.info("Received input for getAllProfiles method.");
        var recordedProfiles = findAllProfilesRepository.findAllProfiles();
        log.info("Returning output for getAllProfiles method.");
        return recordedProfiles;
    }

}
