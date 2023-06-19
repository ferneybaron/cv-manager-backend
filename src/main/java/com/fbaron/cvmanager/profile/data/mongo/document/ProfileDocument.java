package com.fbaron.cvmanager.profile.data.mongo.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "profiles")
public class ProfileDocument {

    @Id
    private String id;
    private String profileTitle;
    private String summary;
    private String seniority;
    private String username;
    private PersonalInformation personalInformation;
    private List<Skill> skills;
    private List<WorkExperience> workExperiences;
    private List<Education> educationalBackground;

    @Version
    private long version;
}
