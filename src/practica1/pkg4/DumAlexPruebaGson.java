/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM2A-28
 */
public class DumAlexPruebaGson {

    public static void main(String[] args) {
        PrintWriter flistajson = null;

        try {
            //creamos el objeto alumno, pasarlo a formato json y luego visualizarlo en pantalla
            Alumno alumno = new Alumno("Ana Sanchez", 9);
            Gson gson = new Gson();
            String datosJson = gson.toJson(alumno);
            System.out.println(datosJson);

            //15-Crear el fichero .json introduciendole los datos en formato json
            flistajson = new PrintWriter(new FileWriter("listaClientesjson.json"));
            flistajson.print(datosJson);
            flistajson.close();

            //Crear un nuevo alumno con los datos que haya en el archivo JSON
            Alumno alumno2 = new Alumno();
            //al alumno le introducimos los datos desde el fichero json
            alumno2 = gson.fromJson(new FileReader("F:\\DAM2A\\Acceso a datos\\NetBeansProjects\\PRACTICA 1.4\\Practica1.4\\listaClientesjson.json"), Alumno.class);
            datosJson = gson.toJson(alumno2);
            System.out.println(datosJson);

            //15- creo la lista, le añado los alumnos y despues me devuelve 
            //por pantalla una cadena tipo json con los datos
            Alumno a1 = new Alumno("Pepe", 8);
            Alumno a2 = new Alumno("Pedro", 8);
            Alumno a3 = new Alumno("Carlos", 8);
            Alumno a4 = new Alumno("Juan", 8);
            Alumno a5 = new Alumno("Alberto", 8);

            ArrayList<Alumno> arrayListAlumnos = new ArrayList<>();
            arrayListAlumnos.add(a1);
            arrayListAlumnos.add(a2);
            arrayListAlumnos.add(a3);
            arrayListAlumnos.add(a4);
            arrayListAlumnos.add(a5);

            datosJson = gson.toJson(arrayListAlumnos);
            System.out.println(datosJson);

            //16-Crear el fichero .json introduciendole los datos en formato json
            flistajson = new PrintWriter(new FileWriter("listaClientesjson.json"));
            flistajson.print(datosJson);
            flistajson.close();

            //17-serializar a una lista de Clientes el listaclientesjson.json
                //conseguir el tipo que es la lista de alumnos
            Type tipoListaAlumno = new TypeToken<List<Alumno>>(){}.getType();
                //creamos la lista de tipo alumno y le introducimos los datos del fichero .json
            List<Alumno> listaCliente = gson.fromJson(new FileReader("listaClientesjson17.json"), tipoListaAlumno);
                //recorremos la lista y mostramos la informacion
            for (Alumno a : listaCliente) {
                System.out.println(a);
            }
            
            cliente c = (cliente)gson.fromJson(new FileReader("F:\\DAM2A\\Acceso a datos\\NetBeansProjects\\PRACTICA 1.4\\Practica1.4\\src\\practica1\\pkg4\\pruebaGSON.json"), cliente.class);
            System.out.println(c.toString());
            

        } catch (IOException ex) {
            Logger.getLogger(DumAlexPruebaGson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
