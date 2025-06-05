package com.couse.security.application.entity.embeddable;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeoPoint {
    
    @Min(-90)
    @Max(90)
    private Double latitude;
    
    @Min(-180)
    @Max(180)
    private Double longitude;

}
