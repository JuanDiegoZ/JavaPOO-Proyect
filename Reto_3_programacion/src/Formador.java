public class Formador extends UsuarioMoodle{
    //Constructor
    //Atributos
    String escalafon;

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;


    }

    //Método calificar
    public void calificar(Tripulante tripulanteACalificar, int k){
        if(tripulanteACalificar.getEntregas()[k]){
            tripulanteACalificar.calificaciones[k] = 5.0;

        }else
        {
            tripulanteACalificar.calificaciones[k] = 0.0;
        }

    }

    //Getter del atributo escalafon
    public String getEscalafon() {
        return escalafon;
    }

    //Setter del atributo escalafon
    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }

}
