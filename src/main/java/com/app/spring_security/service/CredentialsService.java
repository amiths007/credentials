package com.app.spring_security.service;

import com.app.spring_security.model.EmployeeCredentials;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CredentialsService {

    public ResponseEntity createCredentials(List<EmployeeCredentials> credentials);
}
