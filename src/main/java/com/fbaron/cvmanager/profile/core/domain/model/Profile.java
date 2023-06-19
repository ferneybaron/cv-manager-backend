package com.fbaron.cvmanager.profile.core.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Data
@Builder
public class Profile {

    private String id;
    private String profileTitle;
    private String summary;
    private String seniority;
    private String username;
    private PersonalInformation personalInformation;
    private List<Skill> skills;
    private List<WorkExperience> workExperiences;
    private List<Education> educationalBackground;


}
