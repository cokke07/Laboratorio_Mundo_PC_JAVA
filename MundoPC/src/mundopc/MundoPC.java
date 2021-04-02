package mundopc;

import com.gm.mundopc.*;
public class MundoPC {
    
    public static void main(String[] args) {
        //creamos primero los objetos que utilizaremos en nuestra orden
        
        Monitor monitorHP = new Monitor("HP", 15.0);
        Teclado tecladoHP = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB", "HP");
        Computadora computador1 = new Computadora("Compu1", monitorHP, tecladoHP, ratonHP);
        Monitor monitorGama = new Monitor("Gama", 18.0);
        Teclado tecladoGama = new Teclado("USB", "Gama");
        Raton ratonGama = new Raton("USB", "Gama");
        Computadora computador2 = new Computadora("Compu2 gamer", monitorGama, tecladoGama, ratonGama);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computador1);
        orden1.agregarComputadora(computador2);
        orden1.mostrarOrden();
        
        
    }

    
}
