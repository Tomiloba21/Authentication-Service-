package dev.lozter.Authentication.Service.repository;


import dev.lozter.Authentication.Service.model.Role;
import dev.lozter.Authentication.Service.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
