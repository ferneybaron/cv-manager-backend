package com.fbaron.cvmanager.profile.transport.rest.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Data
@Builder
public class WorkExperienceDTO {

    @NotNull(message = "jobTitle cannot be null")
    @Size(min = 2, max = 100, message = "jobTitle must be between 2 and 40 characters")
    private String jobTitle;

    @Size(min = 2, max = 100, message = "company must be between 2 and 40 characters")
    private String company;

    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> responsibilities;

    @Min(value = 1, message = "position cannot be less than 1")
    private int position;

}
