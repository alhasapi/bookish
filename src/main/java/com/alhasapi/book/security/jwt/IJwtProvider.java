package com.alhasapi.book.security.jwt;

import com.alhasapi.book.security.UserPrincipal;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    boolean validateToken(HttpServletRequest request);
}
