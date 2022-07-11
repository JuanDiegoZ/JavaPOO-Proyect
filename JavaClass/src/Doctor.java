public class Doctor {
    //variables estaticas.
    static int nextValidId = 1;
    int id;
    String name;
    String speciality;
    //Metodo constructor.
    //mismo nombre de la clase que se inicializa.
    Doctor(){
        System.out.println("Metodo constructor!!");
        id = nextValidId++;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor " + id);
    }
}
// declarar un objeto:        Doctor  myDoctor;
// Instanciando el objeto:    myDoctor = new Doctor;