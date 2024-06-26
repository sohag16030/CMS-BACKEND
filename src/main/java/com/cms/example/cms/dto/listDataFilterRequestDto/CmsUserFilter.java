package com.cms.example.cms.dto.listDataFilterRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CmsUserFilter {
    private Long cmsUserId;
    private String userName;
    private String roles;
    private String mobileNumber;
    private String email;
    private String name;
    private String gender;
    private String userStatus;
    private Boolean isActive;
}
