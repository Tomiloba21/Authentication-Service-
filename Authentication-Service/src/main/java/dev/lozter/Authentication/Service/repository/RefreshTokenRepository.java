package dev.lozter.Authentication.Service.repository;

import dev.lozter.Authentication.Service.model.RefreshToken;
import dev.lozter.Authentication.Service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {


    Optional<RefreshToken> findByToken(String token);

    @Modifying
    int deleteByUser(User user);
}
