package com.fbaron.cvmanager.profile.core.repositories;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 *
 * The FindProfileByIdRepository Interface provides the method to retrieve a profile by its ID at repository level.
 */

public interface FindProfileByIdRepository {

    /**
     * retrieve a profile for a given profile ID.
     *
     * @param profileId the ID of the profile to search for.
     * @return The object {@link Profile} with the profile details.
     */
    Profile findProfileById(String profileId);

}
