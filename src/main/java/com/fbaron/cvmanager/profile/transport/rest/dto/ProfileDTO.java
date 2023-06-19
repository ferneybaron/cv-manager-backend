package com.fbaron.cvmanager.profile.transport.rest.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/31/2023
 */

@Data
@Builder
public class ProfileDTO {

    private String id;
    private String profileTitle;
    private String summary;
    private String seniority;
    private PersonalInformationDTO personalInformation;
    private List<@Valid SkillDTO> skills;
    private List<@Valid WorkExperienceDTO> workExperiences;
    private List<@Valid EducationDTO> educationalBackground;

}
