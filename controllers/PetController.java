package controllers;

import java.util.List;

import models.Pet;
import models.Specie;
import views.PetView;
import views.SecondView;

public class PetController {
          private PetView petView;
          
          public PetController(PetView petView, List<Pet> pets) {
        	  this.petView=petView;
        	  
        	  this.petView.addInscriereListener(e-> {
                  SecondView secondView = new SecondView();
                  SecondController secondController = new SecondController(secondView,pets);
              });
        	  
        	  this.petView.addVerificareListener(e->{
        		 
        			 Specie specie = petView.getSpecieComboBox();
                     int size=pets.size();
                     int nbDogs=0;
                     int nbCats=0;
                     for(Pet pet: pets) {
                    	 if(pet.getSpecie().equals(Specie.CAINE))
                    		 nbDogs++;
                    	 else nbCats++;
                     }
                     
                     if(specie.equals(Specie.CAINE) && nbDogs>=4)
                    	 petView.noLabel.setVisible(true);
                     else petView.yesLabel.setVisible(true);
        			  
                     if(specie.equals(Specie.PISICA) && nbCats>=9)
                    	 petView.noLabel.setVisible(true);
                     else petView.yesLabel.setVisible(true);		  
        	 });
}}
