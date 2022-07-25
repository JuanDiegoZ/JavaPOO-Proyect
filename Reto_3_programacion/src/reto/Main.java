package reto;

public class Main {
    String [] filaCoches = new String [] {
            "FNC901", "RBP250", "TPS706",
            "ITN503", "RSP845", "SBL560",
            "IVD432", "LCS254", "ECT243",
            "RPL122", "FRS484", "TLB884",
            "NFT948", "INS230"
    };
    Peaje taquillaPeaje =new Peaje(filasCoches);
    taquillaPeaje.proximoCoche();
    taquillaPeaje.proximoCoche();
    taquillaPeaje.proximoCoche();
    taquillaPeaje.proximoCoche();
//Pantallazo 3
    taquillaPeaje.agregarCocheFlyPass();
    taquillaPeaje.proximoCoche();
    taquillaPeaje.agregarCocheFlyPass();
    taquillaPeaje.proximoCoche();
    taquillaPeaje.agregarCocheFlyPass();
//Pantallazo 4
    taquillaPeaje.cambiarEstadoPeaje();
    taquillaPeaje.cambiarEstadoPeaje();
    taquillaPeaje.proximoCoche();
    taquillaPeaje.agregarCocheFlyPass();
}
