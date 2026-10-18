package com.starterkit.user.dto;

import com.starterkit.user.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UpdateUserRequest(
        @NotBlank @Size(max = 150) String fullName,
        @NotNull Role role,
        boolean enabled
) {}
