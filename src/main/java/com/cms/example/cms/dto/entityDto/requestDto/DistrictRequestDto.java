package com.cms.example.cms.dto.entityDto.requestDto;

import com.cms.example.cms.dto.entityDto.responseDto.UpazilaResponseDto;
import com.cms.example.cms.entities.District;
import com.cms.example.cms.entities.Division;
import com.cms.example.cms.entities.Upazila;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictRequestDto {

    private Long districtId;

    private String name;

    private Boolean active;

    private Division division;

    @JsonIgnoreProperties(value = {"districtResponseDto"}, allowSetters = true)
    private List<UpazilaResponseDto> upazilaResponseDtoList;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @JsonIgnore
    public static Boolean isNonNull(DistrictRequestDto districtRequestDto){
        return Objects.nonNull(districtRequestDto) && Objects.nonNull(districtRequestDto.getDistrictId());
    }
}
