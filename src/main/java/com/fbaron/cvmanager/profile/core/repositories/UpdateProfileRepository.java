package com.fbaron.cvmanager.profile.core.repositories;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 *
 * The UpdateProfileRepository Interface provides the method to update a profile.
 */

public interface UpdateProfileRepository {

    /**
     * Updates the details of a user profile with the provided new information.
     *
     * @param profileId the ID of the profile to be updated.
     * @param profile The object containing the profile details.
     * @return The created {@link Profile} object with a unique identifier.
     */
    Profile updateProfile(String profileId, Profile profile);

}
