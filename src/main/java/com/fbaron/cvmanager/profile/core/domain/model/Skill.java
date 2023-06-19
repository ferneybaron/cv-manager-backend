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
public class Skill {

    private String name;
    private String level;
    private String category;

}
