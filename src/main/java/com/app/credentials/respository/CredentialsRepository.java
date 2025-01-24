package com.app.credentials.respository;


import com.app.credentials.model.EmployeeCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends JpaRepository<EmployeeCredentials, Integer> {

}
