package tn.nuitinfo.nuitinfo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.nuitinfo.nuitinfo.Models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    Optional<User> findByEmail(String email);

}
