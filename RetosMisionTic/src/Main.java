public class Main {
    public static void main(String[] args) {

        String [] cola = new String [] {
                "FNC901", "RBP250", "TPS706",
                "ITN503", "RSP845", "SBL560",
                "IVD432", "LCS254", "ECT243",
                "RPL122", "FRS484", "TLB884",
                "NFT948", "INS230"
        };
        Peaje taquillaPeaje =new Peaje(cola);
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();
        taquillaPeaje.proximoCoche();


        taquillaPeaje.agregarCocheFlyPass();
        System.out.println(taquillaPeaje.cochesFlyPass[0]);
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();
        System.out.println(taquillaPeaje.cochesFlyPass[1]);
        taquillaPeaje.proximoCoche();
        taquillaPeaje.agregarCocheFlyPass();


        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.cambiarEstadoPeaje();
        taquillaPeaje.proximoCoche();
        System.out.println(taquillaPeaje.cantidadCochesAtentidos);
        System.out.println(taquillaPeaje.cochesFlyPass[0]);

    }
}
