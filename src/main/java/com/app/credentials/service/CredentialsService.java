package com.app.credentials.service;

import com.app.credentials.model.EmployeeCredentials;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CredentialsService {

    public ResponseEntity createCredentials(List<EmployeeCredentials> credentials);
}
