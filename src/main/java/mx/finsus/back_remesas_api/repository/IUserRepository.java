package mx.finsus.back_remesas_api.repository;

import mx.finsus.back_remesas_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,String> {

    public User findByPhone(String user);
}
