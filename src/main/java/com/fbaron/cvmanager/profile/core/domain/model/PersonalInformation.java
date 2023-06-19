package com.fbaron.cvmanager.profile.core.domain.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */

@Data
@Builder
public class PersonalInformation {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

}
