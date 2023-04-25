package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entites.Module;

public interface ModuleService {
	
	public Module ajouterModule(Module m);
    public Module modifierModule(Module m);
    public void supprimerModule(Long id);
    public List<Module> listeModule();

}
