package br.com.study.vsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.study.vsmovie.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
