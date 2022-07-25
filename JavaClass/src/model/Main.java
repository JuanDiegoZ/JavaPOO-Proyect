package model;

import model.Doctor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor =  new Doctor("juan","juan444j@mail.com");
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn =  new Doctor("Anna", "Anna444j@mail.com");
        myDoctor.showId();

        // sobrecarga de metodos.
        //La sobrecarga de métodos consiste en utilizar el mismo nombre en varios métodos, cada uno con distintos argumentos.
        Doctor myDoctorPepa = new Doctor("Pepa","Ciruganait ");
        System.out.println(myDoctorPepa.speciality);

        //Clases anidadas.
        //Una clase dentro de otra.
        //Clases estaticas: No se necesitan crear instancias para llamarlas.
        //Solo se pueden llamar a los metodos estaticos.
        //Clases Helper, Agrapudas por logica, Encapsulación.
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(),  "6pm");

        for (Doctor.AvailiableAppointment AV: myDoctor.getAvailableAppointment()
             ) {
            System.out.println(AV.getDate()+ " " +  AV.getTime());
        }
        ExerciseCollections exe = new ExerciseCollections();


        //Enum -- coleccion de constantes.
}
}
