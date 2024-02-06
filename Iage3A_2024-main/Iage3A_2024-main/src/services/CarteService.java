package services;

import entities.Carte;
import repositories.CarteRepository;
public class CarteService {
        CarteRepository carteRepository = new CarteRepository();
    public void ajouterCarte(Carte carte){
        carteRepository.insert(carte);
    }
}
