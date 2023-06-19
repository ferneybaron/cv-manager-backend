package com.fbaron.cvmanager.profile.core.domain.model;

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
public class WorkExperience {

    private String jobTitle;
    private String company;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> responsibilities;
    private int position;

}
