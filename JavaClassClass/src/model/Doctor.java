package model;

import java.util.Date;
import java.util.ArrayList;

public class Doctor extends User {
    String speciality;

    //Metodo constructor.
    //mismo nombre de la clase que se inicializa.
    //
    public Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del doctor asginado es:" + name);

        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Clase anidada.
    public static  class  AvailiableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailiableAppointment(Date date,String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    ArrayList<AvailiableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailiableAppointment(date, time) );
    }
    public ArrayList<AvailiableAppointment> getAvailableAppointment(){
        return availableAppointments;
    }


    //Comportamientos


    //Metodos sobreescritos.

    @Override
    public String toString() {
        return super.toString() + " ,Specialiti: " + speciality + " ,Avalible:" + availableAppointments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: San marino.");
        System.out.println("Departamento: Oncologia.");
    }
}
// declarar un objeto:        model.Doctor  myDoctor;
// Instanciando el objeto:    myDoctor = new model.Doctor;