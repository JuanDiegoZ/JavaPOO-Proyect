import java.util.Date;
import java.util.ArrayList;

public class Doctor {
    //variables estaticas.
    static int nextValidId = 1;
    //Constantes.
    public final  static String  CASA = "PLANETA TIERRA";
    int id;
    String name;
    String speciality;

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

    //Metodo constructor.
    //mismo nombre de la clase que se inicializa.
    //
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