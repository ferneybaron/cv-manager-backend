package com.fbaron.cvmanager.profile.data.jpa.repository;

import com.fbaron.cvmanager.profile.data.jpa.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Repository
public interface ProfileJpaRepository extends JpaRepository<ProfileEntity, String> {
}
