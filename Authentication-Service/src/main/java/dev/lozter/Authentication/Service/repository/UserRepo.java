package dev.lozter.Authentication.Service.repository;

import dev.lozter.Authentication.Service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
