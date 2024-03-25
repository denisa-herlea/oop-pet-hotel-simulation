package controllers;

import models.Ocupatie;
import models.User;
import views.FormularView;
import views.HomeView;

import java.util.List;

public class FormularController {
    private FormularView formularView;

    public FormularController (FormularView formularView, List<User> users){
        this.formularView = formularView;

        formularView.addEtapaListener(e->{
            try{
                Ocupatie ocupatie = formularView.getOcupatieComboBox();
                int varsta = formularView.getVarstaField();

                if(ocupatie.equals(Ocupatie.MEDIC)){
                    formularView.setEtapaField(1);
                }
                else if(varsta >= 65 || ocupatie.equals(Ocupatie.PROFESOR)){
                    formularView.setEtapaField(2);
                }
                else if(ocupatie.equals(Ocupatie.ELEV)){
                    formularView.setEtapaField(3);
                }
            }
            catch(Exception ex){
                formularView.showMessage("Bad input!");
            }
        });

        formularView.addInscriereListener(e-> {
            try {
                String nume = formularView.getNumeField();
                int varsta = formularView.getVarstaField();
                Ocupatie ocupatie = formularView.getOcupatieComboBox();

                User user = new User(nume, varsta, ocupatie);
                users.add(user);

                formularView.setVisible(false);
            }
            catch(Exception ex){
                formularView.showMessage("Bad input!");
            }
        });
    }
}
