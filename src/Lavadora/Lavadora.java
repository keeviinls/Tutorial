/*CLASE PARA LAS FUNCIONES LOGICAS DE UNA LAVADORA*/

package Lavadora;

public class Lavadora {

    private int kilos = 0, llenadoCompleto = 0, tipoderopa = 0, lavadocompleto = 0, secadocompleto = 0;

    public Lavadora(int kilos, int tipoderopa){

        this.kilos=kilos;
        this.tipoderopa=tipoderopa;

    }

    private void Llenado(){

        if (kilos <=12){ //PONEMOS 12 DE EJEMPLO, IMAGINEMOS Q LO MAXIMO DE KILOS DE LA LAVADORA ES 12

            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("LLenado Completado");
        }
        else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga por favor");
        }

    }

    private void Lavado(){
        Llenado();
        if (llenadoCompleto == 1){
            if (tipoderopa == 1){
                System.out.println("Ropa Blanca / Lavado Suave ya que es blanca");
                System.out.println("Lavando...");
                lavadocompleto = 1;
            }

            else if(tipoderopa == 2){
                System.out.println("Ropa de Color / Lavado intenso ya que es de color");
                System.out.println("Lavando...");
                lavadocompleto = 1;
            }
            else {
                System.out.println("El tipo de ropa indicado no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado Intenso");
                lavadocompleto = 1;
            }
        }

    }

    private void Secado(){
        Lavado();
        if (lavadocompleto == 1){
            System.out.println("Secando....");
            secadocompleto = 1;
        }
    }

    public void CicloFinalizado(){
        Secado();
        if (secadocompleto == 1){
            System.out.println("Tu ropa esta lista");
        }
    }

}
