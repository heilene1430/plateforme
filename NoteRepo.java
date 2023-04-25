package tn.enicarthage.repositiries;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.entites.notes;

public interface NoteRepo extends JpaRepository<notes, Long> {
	public List<notes> findByEtdId(Long etdId);

}
