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
public class UpdateProfileDTO {

    @Size(min = 2, max = 40, message = "profileTitle must be between 8 and 40 characters")
    private String profileTitle;

    private String summary;

    @Size(min = 2, max = 40, message = "seniority must be between 8 and 40 characters")
    private String seniority;

    @Valid
    @NotNull(message = "personalInformation information must no be null")
    private PersonalInformationDTO personalInformation;

    private List<@Valid SkillDTO> skills;

    private List<@Valid WorkExperienceDTO> workExperiences;

    private List<@Valid EducationDTO> educationalBackground;

}
