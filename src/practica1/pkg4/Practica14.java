/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author DAM2A-28
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        try {
//            JSONParser parser = new JSONParser();
//            Object obj = parser.parse((new FileReader("F:\\DAM2A\\Acceso a datos\\NetBeansProjects\\PRACTICA 1.4\\Practica1.4\\src\\practica1\\pkg4\\prueba1.json")));
//            JSONObject jsonObject = (JSONObject) obj;
//            String texto = (String) jsonObject.get("nombre");
//            System.out.println(texto);
//            texto = (String) jsonObject.get("apellidos");
//            System.out.println(texto);
//            JSONArray tags = (JSONArray) jsonObject.get("tel");
//            Iterator<String> iterator = tags.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//            texto = (String) jsonObject.get("email");
//            System.out.println(texto);
//            long edad = (long) jsonObject.get("edad");
//            System.out.println(edad);
//            JSONObject dir = (JSONObject) jsonObject.get("direccion");
//            System.out.println(dir);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParseException ex) {
//            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("F:\\DAM2A\\Acceso a datos\\NetBeansProjects\\PRACTICA 1.4\\Practica1.4\\src\\practica1\\pkg4\\prueba2.json"));
            JSONObject objeto = (JSONObject) obj;

            JSONArray personas = (JSONArray) objeto.get("datos");
            Iterator<JSONObject> it = personas.iterator();
            while (it.hasNext()) {
                JSONObject jsonObject = (JSONObject) it.next();
                String texto = (String) jsonObject.get("nombre");
                System.out.println(texto);
                texto = (String) jsonObject.get("apellidos");
                System.out.println(texto);
                JSONArray tags = (JSONArray) jsonObject.get("tel");
                Iterator<String> iterator = tags.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                texto = (String) jsonObject.get("email");
                System.out.println(texto);
                long edad = (long) jsonObject.get("edad");
                System.out.println(edad);
                JSONObject dir = (JSONObject) jsonObject.get("direccion");
                System.out.println(dir);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Practica14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
