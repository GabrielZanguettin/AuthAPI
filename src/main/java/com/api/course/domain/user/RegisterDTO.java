package com.api.course.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
