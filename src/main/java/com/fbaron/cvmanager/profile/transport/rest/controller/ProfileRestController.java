package com.fbaron.cvmanager.profile.transport.rest.controller;

import com.fbaron.cvmanager.profile.core.interactors.CreateProfileService;
import com.fbaron.cvmanager.profile.core.interactors.GetAllProfilesService;
import com.fbaron.cvmanager.profile.core.interactors.GetProfileByIdService;
import com.fbaron.cvmanager.profile.core.interactors.UpdateProfileService;
import com.fbaron.cvmanager.profile.transport.rest.dto.CreateProfileDTO;
import com.fbaron.cvmanager.profile.transport.rest.dto.UpdateProfileDTO;
import com.fbaron.cvmanager.profile.transport.rest.mapper.ProfileDtoMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/profiles")
public class ProfileRestController {

    private final CreateProfileService createProfileService;
    private final GetAllProfilesService getAllProfilesService;
    private final GetProfileByIdService getProfileByIdService;
    private final UpdateProfileService updateProfileService;
    private final ProfileDtoMapper profileDtoMapper;

    @PostMapping
    public ResponseEntity<?> createProfile(@RequestBody @Valid CreateProfileDTO dto) {
        log.info("Received a request for POST /api/v1/profiles EndPoint with RequestBody: {}", dto);
        var profile = profileDtoMapper.dtoToDomain(dto);
        createProfileService.createProfile(profile);
        log.info("Returning response for POST /api/v1/profiles EndPoint");
        return ResponseEntity.status(HttpStatus.CREATED).body(null);
    }

    @GetMapping
    public ResponseEntity<?> getAllProfiles() {
        log.info("Received a request for GET /api/v1/profiles EndPoint");
        var profiles = getAllProfilesService.getAllProfiles();
        if (profiles == null) {
            log.warn("Returning response for GET /api/v1/profiles EndPoint: status 204");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
        var recordedProfiles = profileDtoMapper.domainListToDtoList(profiles);
        log.info("Returning response for GET /api/v1/profiles EndPoint");
        return ResponseEntity.status(HttpStatus.OK).body(recordedProfiles);
    }

    @GetMapping("/{profileId}")
    public ResponseEntity<?> getProfileById(@PathVariable String profileId) {
        log.info("Received a request for GET /api/v1/profiles/{} EndPoint", profileId);
        var profile = getProfileByIdService.getProfileById(profileId);
        if (profile == null) {
            log.warn("Returning response for GET /api/v1/profiles/{} EndPoint: status 204", profileId);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
        var recordedProfile = profileDtoMapper.domainToDto(profile);
        log.info("Returning response for GET /api/v1/profiles/{} EndPoint: {}", profileId, recordedProfile);
        return ResponseEntity.status(HttpStatus.OK).body(recordedProfile);
    }

    @PutMapping("/{profileId}")
    public ResponseEntity<?> updateProfile(@PathVariable String profileId, @RequestBody @Valid UpdateProfileDTO dto) {
        log.info("Received a request for PUT /api/v1/profiles/{} EndPoint with RequestBody updateAccountDto: {}", profileId, dto);
        var profile = profileDtoMapper.dtoToDomain(dto);
        profile = updateProfileService.updateProfile(profileId, profile);
        var updatedProfile = profileDtoMapper.domainToDto(profile);
        log.info("Returning response for PUT /api/v1/profiles/{} EndPoint: {}", profileId, updatedProfile);
        return ResponseEntity.status(HttpStatus.OK).body(updatedProfile);
    }

}
