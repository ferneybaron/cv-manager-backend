package com.fbaron.cvmanager.profile.transport.rest.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Data
@Builder
public class SkillDTO {

    @NotNull(message = "Skill name cannot be null")
    @Size(min = 2, max = 40, message = "Skill name must be between 2 and 40 characters")
    private String name;

    private String level;

    @NotNull(message = "Skill category cannot be null")
    @Size(min = 2, max = 40, message = "Skill category must be between 2 and 40 characters")
    private String category;

}
