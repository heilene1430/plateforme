package tn.enicarthage.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "cin" ), @UniqueConstraint(columnNames = "password")
})
public class Etudiant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private int cin;
	private String password;
    private int annee_ent;
    private String adresse;
    private String email;
    private int num_tel;
	private String ville;
	private String codepostal;
	private String nationalité;
	private String imageurl;
	private Date datenaiss;
	private Genre genre;
	
	
	
	
	
	private Groupe groupe;
	
	
	@OneToMany
	List<notes> note;
	public Etudiant(long id, int cin, String password, String nom, String prenom, int annee_ent, Genre genre,
			Date datenaiss, String adresse, String ville, String codepostal, String email, int num_tel,
			String nationalité, Groupe groupe) {
		super();
		this.id = id;
		this.cin = cin;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.annee_ent = annee_ent;
		this.genre = genre;
		this.datenaiss = datenaiss;
		this.adresse = adresse;
		this.ville = ville;
		this.codepostal = codepostal;
		this.email = email;
		this.num_tel = num_tel;
		this.nationalité = nationalité;
		this.groupe = groupe;
	}
	
	
	
}