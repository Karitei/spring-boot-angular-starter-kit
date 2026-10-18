package com.starterkit.user.dto;

import com.starterkit.user.Role;
import com.starterkit.user.User;

import java.time.Instant;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        String fullName,
        Role role,
        boolean enabled,
        Instant createdAt
) {
    public static UserResponse from(User u) {
        return new UserResponse(u.getId(), u.getEmail(), u.getFullName(), u.getRole(), u.isEnabled(), u.getCreatedAt());
    }
}
