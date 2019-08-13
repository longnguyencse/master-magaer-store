package lln.org.vn.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository
public interface UserRepository extends JpaRepository<lln.org.vn.demo.model.User, Long> {

}
