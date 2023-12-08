package tn.nuitinfo.nuitinfo.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.nuitinfo.nuitinfo.Models.User;

public interface IUserRepository extends CrudRepository <User,Long> {
}
