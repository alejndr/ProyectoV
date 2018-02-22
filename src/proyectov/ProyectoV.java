package proyectov;

import funcionesV.tiradas;

public class ProyectoV {

  public static void main(String[] args) {

    int prueba = 0;
    int impactoExitoso=0;
    int mediaimpacto=0;
    int pifia=0;

    //Prueba de función impacto, 10 intentos.
    /* FuncionesV.impacto(4, 5);

    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));
    System.out.println(FuncionesV.impacto(4, 5));*/

    for (int i = 0; i < 1000000; i++) {
      prueba = tiradas.impacto(5, 5, 6);
      if (prueba >= 0) {
        impactoExitoso++;
        mediaimpacto += prueba;
      } else {
        pifia++;
      }
    }
    
    System.out.println("Simulando 1.000.000 intentos para impactar con 5 de destreza y 5 en ArmasCaC:");
    System.out.println("Impactos exitosos: " + impactoExitoso);
    System.out.println("Media de los dados que pasan a daño: " + mediaimpacto/impactoExitoso);
    System.out.println("Pifias: "+ pifia);

  }

}
