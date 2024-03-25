package com.ead.authuser.services;

import java.util.UUID;

import org.springframework.data.domain.Pageable;

public interface UtilsService {
    String generateUrl(UUID userId, Pageable pageable);
}
