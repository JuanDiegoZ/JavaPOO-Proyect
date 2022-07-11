public class Main {
    public static void main(String[] args) {
        Doctor myDoctor =  new Doctor();
        myDoctor.name = "Pepe";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(myDoctor.id);


        Doctor myDoctorAnn =  new Doctor();
        myDoctorAnn.showId();
        myDoctor.showId();
        myDoctor.showHouse();
        System.out.println(myDoctor.CASA);

        // sobrecarga de metodos.
        //La sobrecarga de métodos consiste en utilizar el mismo nombre en varios métodos, cada uno con distintos argumentos.
        Doctor myDoctorPepe =  new Doctor();
        Doctor myDoctorPepa = new Doctor("Pepa","Ciruganait ");
        System.out.println(myDoctorPepa.name);
        System.out.println(myDoctorPepa.speciality);

    }
}