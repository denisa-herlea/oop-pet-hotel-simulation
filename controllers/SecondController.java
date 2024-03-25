package controllers;

import java.util.List;

import models.Pet;
import models.Specie;
import views.SecondView;

public class SecondController {
  
	private SecondView secondView;
	private double pret;
	
	public SecondController(SecondView secondView, List<Pet> pets) {
		this.secondView=secondView;
		
		secondView.addCazeazaListener(e->{
		            try{
		              
		            	 String nume=secondView.getName();
		            	 double greutate=secondView.getGreutateField();
		            	 Specie specie=secondView.getSpecieComboBox();

		            	 int size=pets.size();

	                     int nbDogs=0;
	                     int nbCats=0;
	                     for(Pet pet: pets) {
	                    	 if(pet.getSpecie().equals(Specie.CAINE))
	                    		 nbDogs++;
	                    	 else nbCats++;
	                     }
	                     
	                     if(specie.equals(Specie.CAINE) && nbDogs<4)
	                     {
	                    	 Pet pet= new Pet(nume, greutate,specie);
	                    	 pets.add(pet);
	                    	 pret=50+0.02*greutate;
	                     }
		            	
	                     if(specie.equals(Specie.PISICA) && nbCats<9)
	                     {
	                    	 Pet pet= new Pet(nume, greutate,specie);
	                    	 pets.add(pet);
	                    	 pret=30;
	                    	 
	                     }
	                     secondView.showMessage("The pet has been accommodated!");
	                     
		            }
		            catch(Exception ex){
		                secondView.showMessage("Bad input!");
		            }
		        }
		);
		
		secondView.addSpalaListener(e->{
            try{
	              
            	String nume=secondView.getName();
            	double greutate=secondView.getGreutateField();
            	Specie specie=secondView.getSpecieComboBox();
                 int exista=0;
            	
            	 for(Pet pet: pets)
            	 {
            		 if(pet.getNume().equals(nume))
            			 pret=pret+15;
            		     exista=1;
            	 }
            
            	if(exista==0)
            	{
				 int size=pets.size();
                 int nbDogs=0;
                 int nbCats=0;
                 for(Pet pet: pets) {
                	 if(pet.getSpecie().equals(Specie.CAINE))
                		 nbDogs++;
                	 else nbCats++;
                 }
                 
                 if(specie.equals(Specie.CAINE) && nbDogs<4)
                 {
                	 Pet pet= new Pet(nume, greutate,specie);
                	 pets.add(pet);
                	 pret=50+0.02*greutate;
                 }
            	
                 if(specie.equals(Specie.PISICA) && nbCats<9)
                 {
                	 Pet pet= new Pet(nume, greutate,specie);
                	 pets.add(pet);
                	 pret=30;
                	 
                 }
                 pret=pret+15;
               }
            	secondView.showMessage("The pet was washed!");
            }

            catch(Exception ex){
                secondView.showMessage("Bad input!");
            }  
        });
		
		
	  secondView.addPlimbaListener(e->{
            try{
	              
            	String nume=secondView.getName();
            	double greutate=secondView.getGreutateField();
            	Specie specie=secondView.getSpecieComboBox();
                 int exista=0;
            	
            	 for(Pet pet: pets)
            	 {
            		 if(pet.getNume().equals(nume))
            			 pret=pret+15;
            		     exista=1;
            	 }
            
            	if(exista==0)
            	{int size=pets.size();  
                 int nbDogs=0;
                 int nbCats=0;
                 for(Pet pet: pets) {
                	 if(pet.getSpecie().equals(Specie.CAINE))
                		 nbDogs++;
                	 else nbCats++;
                 }
                 
                 if(specie.equals(Specie.CAINE) && nbDogs<4)
                 {
                	 Pet pet= new Pet(nume, greutate,specie);
                	 pets.add(pet);
                	 pret=50+0.02*greutate;
                 }
            	
                 if(specie.equals(Specie.PISICA) && nbCats<9)
                 {
                	 Pet pet= new Pet(nume, greutate,specie);
                	 pets.add(pet);
                	 pret=30;
                	 
                 }
                 pret=pret+5;
                 
                 }
            	secondView.showMessage("The animal has been walked!");
            }

            catch(Exception ex){
                secondView.showMessage("Bad input!");
            }
	  });
		
	  secondView.addVeziListener(e->{
		  secondView.showMessage("The current price of the services is " + pret);
	  });
	  
		
		
	}
}
