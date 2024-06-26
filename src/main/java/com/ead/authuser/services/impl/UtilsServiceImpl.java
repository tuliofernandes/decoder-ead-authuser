package com.ead.authuser.services.impl;

import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ead.authuser.services.UtilsService;

@Service
public class UtilsServiceImpl implements UtilsService {
    private String REQUEST_URI = "http://localhost:8082";

    public String generateUrl(UUID userId, Pageable pageable) {
        return this.REQUEST_URI + "/courses?userId=" + userId
            + "&page=" + pageable.getPageNumber()
            + "&size=" + pageable.getPageSize()
            + "&sort=" + pageable.getSort().toString().replaceAll(":", ",").replaceAll(" ", "");
    }
}
