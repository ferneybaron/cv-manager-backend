package com.fbaron.cvmanager.profile.core.interactors;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 *
 * The CreateProfileService Interface provides the method to create a profile.
 */

public interface CreateProfileService {

    /**
     * Creates a new profile with the provided profile details.
     *
     * @param profile The object containing the profile details.
     * @return The created {@link Profile} object with a unique identifier.
     */
    Profile createProfile(Profile profile);

}
