/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introspecion_reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeDebug;

/**
 *
 * @author Alejandro Santos Gutiérrez
 */
public class Introspecion_Reflexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        String nombreClase;
        Scanner introduceDato = new Scanner(System.in);
        
        
        System.out.println("Introduce el nombre de una clase");
        String entrada = introduceDato.next();
        Class class1 = Class.forName(entrada);
        
        //nombreClase = introduceDato.nextLine();
        ObtenerNombreClase(class1);
        Obtenerconstructores(class1);
        ObtenerCampos(class1);
        ObtenerMetodos(class1);
    }
    
    //Método con el que obtenemos el nombre de la clase pasa como parámetro
    public static void ObtenerNombreClase(Class clase)
    {
        System.out.println("El nombre de la clase es: "+ clase.getName());
    }
    
    //Métodos con el cual obtenemos los constructores de la clase
    public static void Obtenerconstructores(Class clase)
    {
        Constructor[] constructores = clase.getConstructors();
        for( int i = 0; i < constructores.length; i++)
        {
                
            System.out.println("Constructor: " + constructores[i]);       
        }
    }
    
    //Método con el que obtenemos los campos(fields) de la clase
    public static void ObtenerCampos(Class clase)
    {
        Field[] fields = clase.getFields();
        
        for(int i = 0; i < fields.length; i++)
        {
            System.out.println("Field: " + fields[i]);
        }
    }
    
    //Método con el que obtenemos todos los métodos de la clase
    public static void ObtenerMetodos(Class clase)
    {
        Method[] metodos = clase.getMethods();
        
        for(int i = 0; i < metodos.length; i++)
        {
            System.out.println("Método: " + metodos[i]);
        }
    }
            
    

    
}
