package br.com.study.vsmovie.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Nome da tabela que vai usada no banco de dados
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Atributos
	private Long id;
	private String email;
	
	
	//Construtor
	public User() {}

	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}
	
	
	//Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
