package com.fbaron.cvmanager.profile.core.repositories;

import com.fbaron.cvmanager.profile.core.domain.model.Profile;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 * <p>
 * The CreateProfileRepository Interface provides the method to...
 */

public interface CreateProfileRepository {

    /**
     * Creates a new profile with the provided profile details in the repository.
     *
     * @param profile
     * @return {@link Profile}.
     */
    Profile createProfile(Profile profile);

}
