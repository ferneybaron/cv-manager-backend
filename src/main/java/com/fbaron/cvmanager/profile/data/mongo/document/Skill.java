package com.fbaron.cvmanager.profile.data.mongo.document;

import lombok.Builder;
import lombok.Data;

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
