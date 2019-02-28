package sto.spb.oauth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sto.spb.oauth2.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	@Query("SELECT u FROM User u WHERE u.username=:username")
	public User findByUsername(@Param("username") String userName);
	
}
