package com.fbaron.cvmanager.profile.core.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author Ferney Estupinan Baron
 * @Date 6/1/2023
 */

@Data
@Builder
public class Education {

    private String institution;
    private String degree;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private int position;

}
