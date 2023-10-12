package com.healthmanager.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold user and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the user",
            example = "John Doe"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "The length of the user name should be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the user",
            example = "John@gmail.com"
    )
    @NotEmpty(message = "Email Address cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile Number of the user",
            example = "2031234567"
    )
    @Pattern(regexp="(^$|[0-9]{10})", message = "Please enter a valid 10-digit number")
    private String mobileNumber;

    @Schema(
            description = "Account details of the user"
    )
    private AccountsDto accountsDto;
}
