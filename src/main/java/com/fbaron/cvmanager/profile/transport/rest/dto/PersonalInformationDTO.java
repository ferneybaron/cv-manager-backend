package com.fbaron.cvmanager.profile.transport.rest.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/31/2023
 */

@Data
@Builder
public class PersonalInformationDTO {

    @NotNull(message = "firstName cannot be null")
    @Size(min = 2, max = 40, message = "firstName must be between 8 and 40 characters")
    private String firstName;

    @NotNull(message = "firstName cannot be null")
    @Size(min = 2, max = 40, message = "firstName must be between 8 and 40 characters")
    private String lastName;

    private String address;
    private String phone;

    @NotNull(message = "email cannot be null")
    @Size(min = 6, max = 70, message = "email must be between 6 and 70 characters")
    @Email(message = "email should be valid")
    private String email;

}
