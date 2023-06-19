package com.fbaron.cvmanager.profile.data.config;

import com.fbaron.cvmanager.profile.core.repositories.CreateProfileRepository;
import com.fbaron.cvmanager.profile.data.jpa.ProfileJpaAdapter;
import com.fbaron.cvmanager.profile.data.jpa.mapper.ProfileJpaMapper;
import com.fbaron.cvmanager.profile.data.jpa.repository.ProfileJpaRepository;
import com.fbaron.cvmanager.profile.data.mongo.ProfileMongodbAdapter;
import com.fbaron.cvmanager.profile.data.mongo.mapper.ProfileMongodbMapper;
import com.fbaron.cvmanager.profile.data.mongo.repository.ProfileMongodbRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/12/2023
 *
 * Configuration class for the SMS feature.
 */

@Configuration
@RequiredArgsConstructor
public class ProfileConfig {

    private final ProfileJpaRepository profileJpaRepository;
    private final ProfileJpaMapper profileJpaMapper;

    private final ProfileMongodbRepository profileMongodbRepository;
    private final ProfileMongodbMapper profileMongodbMapper;

    /**
     * Creates an instance of the desired implementation of CreateProfileRepository based on the chosen SMS provider.
     *
     * @return The {@link CreateProfileRepository} CreateProfileRepository bean.
     */
    @Bean
    public CreateProfileRepository createProfileRepository() {
        //return new ProfileJpaAdapter(profileJpaRepository, profileJpaMapper);
        return new ProfileMongodbAdapter(profileMongodbRepository, profileMongodbMapper);
    }

}
