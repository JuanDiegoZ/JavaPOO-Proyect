package reto;

public class Peaje {
    //EN ESTE ESPACIO SE ESCRIBEN LOS ATRIBUTOS DE LA CLASE Peaje
    private String[] cochesFlyPass;
    private String[] filaCoches;
    private boolean estadoPeaje = true;
    private int cantidadCochesAtentidos = 1;
    private int cocheEnAtencion = 0;


    //A CONTINUACIÓN, BAJO LOS ATRIBUTOS, SE ESCRIBEN LOS MÉTODOS DEFINIDOS
    //EN EL ENUNCIADO DEL PROBLEMA:

    public Peaje(String[] filaCoches) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO DEL PROBLEMA
        this.filaCoches =  filaCoches;
        this.cochesFlyPass = new String[filaCoches.length];
        for (int i = 0; i < filaCoches.length; i++) {
            cochesFlyPass[i] = " ";
        }
    }

    public void proximoCoche(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje){
            cocheEnAtencion += 1;
            cantidadCochesAtentidos+= 1;
        }
    }

    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCocheFlyPass(){
        String cocheABuscar = filaCoches[cocheEnAtencion];
        for(String coche:cochesFlyPass){
            if(coche.equals(cocheABuscar)){
                break;
            }
            if(" ".equals(coche)){
                coche = cocheABuscar;
            }
        }
    }

    public void cambiarEstadoPeaje(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO DEL PROBLEMA
        if(estadoPeaje)
        {
            estadoPeaje = false;
        } else
        {
            estadoPeaje = true;
        }
    }

    //INSERTE LOS GETTERS Y SETTERS A PARTIR DE ACÁ:


    public String[] getCochesFlyPass() {
        return cochesFlyPass;
    }

    public void setCochesFlyPass(String[] cochesFlyPass) {
        this.cochesFlyPass = cochesFlyPass;
    }

    public String[] getFilaCoches() {
        return filaCoches;
    }

    public void setFilaCoches(String[] filaCoches) {
        this.filaCoches = filaCoches;
    }

    public boolean isEstadoPeaje() {
        return estadoPeaje;
    }

    public void setEstadoPeaje(boolean estadoPeaje) {
        this.estadoPeaje = estadoPeaje;
    }

    public void setCantidadCochesAtentidos(int cantidadCochesAtentidos) {
        this.cantidadCochesAtentidos = cantidadCochesAtentidos;
    }

    public int getCocheEnAtencion() {
        return cocheEnAtencion;
    }

    public void setCocheEnAtencion(int cocheEnAtencion) {
        this.cocheEnAtencion = cocheEnAtencion;
    }

}
