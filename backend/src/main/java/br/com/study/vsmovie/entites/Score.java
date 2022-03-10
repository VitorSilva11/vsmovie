package br.com.study.vsmovie.entites;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//Nome que vai está no banco de dados
@Table(name = "tb_score")
public class Score {
	
	//Para chave composta se utiliza a notação EmbeddedId
	@EmbeddedId
	//Atributos
	private ScorePk id = new ScorePk();
	private Double value;
	
	
	//Construtor
	public Score() {}


	
	//Getters e Setters
	
	//Associando o filme ao score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//Associando o usuario ao score
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePk getId() {
		return id;
	}


	public void setId(ScorePk id) {
		this.id = id;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}

	
	
}
