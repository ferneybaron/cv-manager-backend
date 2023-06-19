package com.fbaron.cvmanager.profile.transport.rest.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/31/2023
 */

@Data
@Builder
public class EducationDTO {

    @NotNull(message = "institution cannot be null")
    @Size(min = 2, max = 100, message = "institution must be between 2 and 40 characters")
    private String institution;

    @NotNull(message = "degree cannot be null")
    @Size(min = 2, max = 100, message = "degree must be between 2 and 40 characters")
    private String degree;

    private LocalDate startDate;
    private LocalDate endDate;
    private String description;

    @Min(value = 1, message = "position cannot be less than 1")
    private int position;

}
