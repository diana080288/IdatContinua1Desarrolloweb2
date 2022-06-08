package com.idat.edu.model;



import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "MallaCurricular")
@Entity

public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdMalla;
	private Integer año;
	
	//relacion de 1 a 1
	@OneToOne(mappedBy = "Universidad")
	private Universidad univ;
	
	//relacion de muchos a 1
	
	@ManyToOne
	@JoinColumn(
			name = "id_curso",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey
			(foreignKeyDefinition = "foreign key(id_curso) references Curso(id_curso)"))
	private Curso curso;
	
	public Integer getIdMalla() {
		return IdMalla;
	}
	public void setIdMalla(Integer idMalla) {
		IdMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}

	
	
}
