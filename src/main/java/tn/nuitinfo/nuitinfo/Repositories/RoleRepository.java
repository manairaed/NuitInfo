package tn.nuitinfo.nuitinfo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.nuitinfo.nuitinfo.Models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(String role);

}
