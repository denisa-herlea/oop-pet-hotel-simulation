import java.util.ArrayList;
import java.util.List;

import controllers.PetController;
import models.Pet;
import models.Specie;
import views.PetView;

public class Main {
      public static void main(String[] args) {
		List<Pet> pets= new ArrayList<>();
		Pet pet1=new Pet("Ariss",4,Specie.CAINE);
		Pet pet2=new Pet("Rolly",8,Specie.CAINE);
		Pet pet3=new Pet("Zora",3,Specie.CAINE);
		
		Pet pet4=new Pet("Toulouse",4,Specie.PISICA);
		Pet pet5=new Pet("Marie",4,Specie.PISICA);
		Pet pet6=new Pet("Berlioz",4,Specie.PISICA);
		
		PetView petView=new PetView();
		PetController petController=new PetController(petView, pets);
	}
}
