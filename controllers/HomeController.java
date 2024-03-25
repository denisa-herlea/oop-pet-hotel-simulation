package controllers;

import models.Ocupatie;
import models.User;
import views.FormularView;
import views.HomeView;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class HomeController {
    private HomeView homeView;
    public HomeController(HomeView homeView, List<User> users){
        this.homeView = homeView;

        this.homeView.addInscriereListener(e-> {
            FormularView formularView = new FormularView();
            FormularController formularController = new FormularController(formularView,users);
        });

        this.homeView.addVeziPacientiListener(e->{
            try{
                int etapa = homeView.getEtapaTextField();
                List<User> usersShow = new ArrayList<>();
                if(etapa == 1){
                    for(User user: users){
                        if(user.getOcupatie().equals(Ocupatie.MEDIC)){
                            usersShow.add(user);
                        }
                    }
                }
                else if (etapa == 2){
                    for(User user: users){
                        if(user.getVarsta() >= 65 || user.getOcupatie().equals(Ocupatie.PROFESOR)){
                            usersShow.add(user);
                        }
                    }
                }
                else if (etapa == 3) {
                    for(User user: users){
                        if(user.getOcupatie().equals(Ocupatie.ELEV)){
                            usersShow.add(user);
                        }
                    }
                }
                homeView.showMessage(usersShow.toString());
            }
            catch(NumberFormatException ex){
                homeView.showMessage("Insert a number:");
            }
        });
    }
}
