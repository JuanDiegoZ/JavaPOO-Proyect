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
    }
}