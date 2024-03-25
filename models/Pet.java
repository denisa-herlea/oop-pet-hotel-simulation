package models;

public class Pet {
     private String nume;
     private double greutate;
     private Specie specie;
     
     public Pet(String nume, double greutate, Specie specie)
     {
    	 this.nume = nume;
         this.greutate = greutate;
         this.specie= specie;
     }
     
     public String getNume() {
         return nume;
     }

     public double getGreutate() {
         return greutate;
     }

     public Specie getSpecie() {
         return specie;
     }

     public void setNume(String nume) {
         this.nume = nume;
     }

     public void setGreutate(double greutate) {
         this.greutate = greutate;
     }

     public void setSpecie(Specie specie) {
         this.specie =specie;
     }

     @Override
     public String toString() {
         return nume + " ";
     }
 }
	

