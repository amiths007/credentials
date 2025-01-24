package com.app.spring_security.respository;


import com.app.spring_security.model.EmployeeCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepository extends JpaRepository<EmployeeCredentials, Integer> {

}
