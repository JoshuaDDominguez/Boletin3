
package boletin3_1;

public class Boletin3_1 {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.println("Velocidade inicial = "+coche1.getVelocidade()+"Km/h");
        coche1.acelerar(120);
        System.out.println("Velocidade maxima = "+coche1.getVelocidade()+"Km/h");
        coche1.frenar(70);
        System.out.println("velocidade despois de frenar = "+coche1.getVelocidade()+"Km/h");
        
    }
    
}
