package com.fbaron.cvmanager.profile.data.mongo;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;
import com.fbaron.cvmanager.profile.core.repositories.CreateProfileRepository;
import com.fbaron.cvmanager.profile.core.repositories.FindAllProfilesRepository;
import com.fbaron.cvmanager.profile.core.repositories.FindProfileByIdRepository;
import com.fbaron.cvmanager.profile.core.repositories.UpdateProfileRepository;
import com.fbaron.cvmanager.profile.data.mongo.mapper.ProfileMongodbMapper;
import com.fbaron.cvmanager.profile.data.mongo.repository.ProfileMongodbRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Slf4j
@RequiredArgsConstructor
public class ProfileMongodbAdapter implements CreateProfileRepository, FindAllProfilesRepository,
        FindProfileByIdRepository, UpdateProfileRepository {

    private final ProfileMongodbRepository profileMongodbRepository;
    private final ProfileMongodbMapper profileMongodbMapper;

    /**
     * Creates a new profile with the provided profile details in the repository.
     *
     * @param profile The profile to be created.
     * @return The created {@link Profile} object with a unique identifier.
     */
    @Override
    public Profile createProfile(Profile profile) {
        log.info("Received input for createProfile method with values profile: {}", profile);
        var profileDocument = profileMongodbMapper.domainToDocument(profile);
        profileDocument = profileMongodbRepository.save(profileDocument);
        var recordedProfile = profileMongodbMapper.documentToDomain(profileDocument);
        log.info("Returning output for createProfile method with values recordedProfile: {}", recordedProfile);
        return recordedProfile;
    }

    @Override
    public List<Profile> findAllProfiles() {
        log.info("Received input for findAllProfiles method.");
        var recordedProfiles = profileMongodbRepository.findAll();
        log.info("Returning output for findAllProfiles method.");
        return profileMongodbMapper.documentListToDomainList(recordedProfiles);
    }

    @Override
    public Profile findProfileById(String profileId) {
        log.info("Received input for findProfileById method with values profileId: {}", profileId);
        var recordedProfile = profileMongodbRepository.findById(profileId).orElse(null);
        log.info("Returning output for findProfileById method with values recordedProfile: {}", recordedProfile);
        return profileMongodbMapper.documentToDomain(recordedProfile);
    }

    @Override
    public Profile updateProfile(String profileId, Profile profile) {
        log.info("Received input for updateProfile method with values profileId: {}, profile: {}", profileId, profile);
        var recordedProfileOpt = profileMongodbRepository.findById(profileId);
        if (recordedProfileOpt.isEmpty()) return null;
        var profileDocument = profileMongodbMapper.domainToDocument(profile);
        profileDocument.setId(profileId);
        profileDocument.setVersion(recordedProfileOpt.get().getVersion());
        profileDocument = profileMongodbRepository.save(profileDocument);
        var recordedProfile = profileMongodbMapper.documentToDomain(profileDocument);
        log.info("Returning output for updateProfile method with values recordedProfile: {}", recordedProfile);
        return recordedProfile;
    }

}
