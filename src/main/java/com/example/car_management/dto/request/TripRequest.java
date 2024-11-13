package com.example.car_management.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TripRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    //private Integer tripId;

    @NotNull(message = "departure must not null")
    @NotEmpty(message = "departure must not empty")
    private String departure;

    @NotNull(message = "departure must not null")
    @NotEmpty(message = "departure must not empty")
    private String destination;
}