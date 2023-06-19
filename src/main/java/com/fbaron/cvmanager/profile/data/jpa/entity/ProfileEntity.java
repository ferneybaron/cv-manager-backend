package com.fbaron.cvmanager.profile.data.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * @author Ferney Estupinan Baron
 * @Date 5/26/2023
 */
@Entity
@Table(name = "profile")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProfileEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "profileTitle", length = 40)
    private String profileTitle;

    @Lob
    @Column(name = "summary")
    private String summary;

    @Column(name = "seniority", length = 40)
    private String seniority;

    @Column(name = "username", length = 40)
    private String username;

}
