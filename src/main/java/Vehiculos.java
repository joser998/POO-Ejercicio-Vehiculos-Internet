import java.util.Scanner;
/*
        Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca, 
        modelo y precio, imprima las propiedades del vehículo más barato. 
        Para ello, se deberán leer por teclado las características de cada vehículo y crear 
            una clase que represente a cada uno de ellos.
*/
public class Vehiculos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Atributos de clase
        String marca;
        String modelo;
        double precio;
        int indiceBarato;
        
        System.out.println("Cantidad de elementos  a guardar: ");
        int cantidad=sc.nextInt();
        
        //Arreglo de Objetos
        Caracteristicas coches[] = new Caracteristicas[cantidad];
        
        //for para guardar la cantidad que sea de objetos
        for(int i=0; i<coches.length; i++){
            
            sc.nextLine();  //Limpiar el buffer
            System.out.println((i+1)  + ".-Caracteristicas del coche\n");
            System.out.print("Marca: ");
            marca=sc.nextLine();
            System.out.print("Modelo: ");
            modelo=sc.nextLine();
            System.out.print("Precio: ");
            precio=sc.nextDouble();
            
            coches[i]= new Caracteristicas(marca, modelo, precio);
        }
        
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].MostrarDatos());
        
    }
    
      //Metodo para saber cual es el coche mas barato mediante su indice
    public static int indiceCocheMBarato(Caracteristicas coches[]){
            double precio;
            int indice=0;
            precio=coches[0].getPrecio();
            for(int i=1; i<coches.length; i++){
                if(coches[i].getPrecio() < precio){
                    precio=coches[i].getPrecio();
                    indice=i;
                }
            }
            
            return indice;
    }
}
