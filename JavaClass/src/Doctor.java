public class Doctor {
    //variables estaticas.
    static int nextValidId = 1;
    //Constantes.
    public final  static String  CASA = "PLANETA TIERRA";
    int id;
    String name;
    String speciality;
    //Metodo constructor.
    //mismo nombre de la clase que se inicializa.
    Doctor(){
        System.out.println("Metodo constructor!!");
        id = nextValidId++;
    }
    // Sobrecarga de métodos y constructores:
    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor " + id);
    }
    public void showHouse(){
        System.out.println("Nuestra casa es: " + CASA);
    }
}
// declarar un objeto:        Doctor  myDoctor;
// Instanciando el objeto:    myDoctor = new Doctor;