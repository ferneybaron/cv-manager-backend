package com.fbaron.cvmanager.profile.core.interactors;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 *
 * The CreateProfileService Interface provides the method to retrieve a profile by its ID.
 */

public interface GetProfileByIdService {

    /**
     * retrieve a profile for a given profile ID.
     *
     * @param profileId the ID of the profile to search for.
     * @return The object {@link Profile} with the profile details.
     */
    Profile getProfileById(String profileId);

}
