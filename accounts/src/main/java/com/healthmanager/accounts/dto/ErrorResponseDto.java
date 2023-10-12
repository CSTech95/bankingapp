package com.healthmanager.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Name of the customer"
)
public class ErrorResponseDto {

    @Schema(
            description = "API Path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code that represents the error"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message that describes the error"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;
}
