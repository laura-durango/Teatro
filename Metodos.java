import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public ObjPunto4 [][] CrearMatriz (ObjPunto4[][]m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                

               ObjPunto4 o = new ObjPunto4(); // constructor vacío

                System.out.println("Asiento [" + i + "][" + j + "]");

                System.out.print("Numero: ");
                o.setNumero(sc.nextInt());

                System.out.print("Fila: ");
                o.setFila(sc.nextInt());

                System.out.print("Precio: ");
                o.setPrecio(sc.nextInt());

                m[i][j] = o;  //  guardamos el objeto en la matriz


            }
        }

        return m;
    }
      //  Ordenar por precio ascendente por cada fila
    public ObjPunto4[][] OrdenarPorPrecio(ObjPunto4[][] m) {

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length - 1; j++) {

                for (int k = 0; k < m[i].length - 1 - j; k++) {

                    if (m[i][k].getPrecio() > m[i][k + 1].getPrecio()) {

                        ObjPunto4 aux = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = aux;
                    }
                }
            }
        }

        return m;
    }

    
}
