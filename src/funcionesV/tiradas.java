package funcionesV;

/**
 *
 * @author Alejandro
 */
public class tiradas {

  /**
   * Tirada de un dado de 10 caras
   *
   * @return Un numero de entre 1 y 10.
   */
  public static int d10() {

    int tirada = (int) (Math.random() * 10 + 1);

    return tirada;
  }

  /**
   * Devuelve en que turno actua el personaje
   *
   * @param destreza La puntuación en destreza del personaje.
   * @param astucia La puntuación en astucia del personaje.
   * @return El primer turno en el que podria actuar el personaje.
   */
  public static int iniciativa(int destreza, int astucia) {

    int iniciativa = destreza + astucia + d10();

    return iniciativa;
  }

  /**
   * Calcula una tirada de impacto: destreza + armas CaC menos un exito
   *
   * @param destreza La puntuación en destreza del personaje.
   * @param armasCaC La puntuación en armas cuerpo a cuerpo del personaje.
   * @return El resultado de una tirada para impactar.
   */
  public static int impacto(int destreza, int armasCaC, int dificultadArma) {

    int[] arrayDestreza = new int[destreza];
    int[] arrayarmasCaC = new int[armasCaC];
    int exitosDestreza = 0;
    int exitosArmasCaC = 0;
    int impacto;

    for (int i = 0; i < destreza; i++) {
      arrayDestreza[i] = d10();
      if (arrayDestreza[i] >= dificultadArma) {
        exitosDestreza++;
      } else if (arrayDestreza[i] == 1) {
        exitosDestreza--;
      }

    }

    for (int i = 0; i < armasCaC; i++) {
      arrayarmasCaC[i] = d10();
      if (arrayarmasCaC[i] >= dificultadArma) {
        exitosArmasCaC++;
      } else if (arrayarmasCaC[i] == 1) {
        exitosArmasCaC--;
      }
    }

    impacto = exitosDestreza + exitosArmasCaC - 1;

    return impacto;

  }
  
  
  /**
   * Calcula una tirada de daño: destreza + armas CaC menos un exito
   *
   * @param fuerza La puntuación en fuerza del personaje.
   * @param dañoArma El daño del arma cuerpo a cuerpo del personaje.
   * @param impacto Los dados que pasan de la tirada de impacto
   * @return El resultado de una tirada para hacer daño.
   */
  public static int daño(int fuerza, int dañoArma, int impacto) {
  
  
  
  }

}
