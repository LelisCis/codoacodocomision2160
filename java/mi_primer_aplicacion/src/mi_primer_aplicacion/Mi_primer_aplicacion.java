
package mi_primer_aplicacion;

import accesorios.Auto;

public class Mi_primer_aplicacion {
    
    public static void main(String[] args) {
        int numero;
        String nombre;
        float promedio;
        boolean llueve = true;
        numero=13;
        float resultado;
        resultado = numero +19;
        promedio = (numero + 19) / 2;
        System.out.println("Hola esta es mi primer aplicación!!");
        System.out.println(resultado);
        System.out.println("El promedio es: "+ promedio);
        System.out.println(45 > 19 != 19 < 32);
        System.out.println("");
        if(llueve == true){
            System.out.println("Usamos paraguas!!");
        }else{
            System.out.println("No usaremos paraguas!!");
        }
        Juego jugador = new Juego(0,3,"Mario","Hongos","Martillo");        
        Juego jugador2 = new Juego(0,3,"Juan","Hongos","Martillo");
        Juego jugador3 = new Juego(0,3,"Juan","Hongos","Martillo");


        System.out.println("Mi nombre es " + jugador.personaje);
        System.out.println("Tengo: " + jugador.getVidas()+ " Vidas");
        System.out.println(jugador.mostrarSaludo());        
        System.out.println(jugador2.mostrarSaludo());
        Auto miAuto = new Auto(250,5,"azul","deportivo","2021","gwk512");
        miAuto.setEncedido(true);
        System.out.println(miAuto.encender_auto());
       

    }
    
}
