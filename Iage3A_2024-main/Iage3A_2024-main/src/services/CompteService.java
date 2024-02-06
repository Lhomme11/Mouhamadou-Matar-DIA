package services;

import java.util.List;

//import entities.Client;
import entities.Compte;
import repositories.CompteRepository;

public class CompteService {
    CompteRepository CompteRepository=new CompteRepository();
    public void ajouterCompte(Compte compte){
        CompteRepository.insert(compte);
    }
   public  List<Compte> listerCompte(){
    return CompteRepository.selectAll();
    }
    
    //public  List<Compte>listerCompte(Client client){
    //   return null;
    // }
}
