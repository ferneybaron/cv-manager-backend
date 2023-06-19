package com.fbaron.cvmanager.profile.core.repositories;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 *
 * The FindAllProfilesRepository Interface provides the method to retrieve all profiles at repository level.
 */

public interface FindAllProfilesRepository {

    /**
     * Finds all profiles with the provided profile details.
     *
     * @return The {@link List<Profile>} list with all profiles.
     */
    List<Profile> findAllProfiles();

}
