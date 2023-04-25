package tn.enicarthage.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enicarthage.entites.Module;

public interface ModuleRepo extends JpaRepository<Module, Long>{
	

}
