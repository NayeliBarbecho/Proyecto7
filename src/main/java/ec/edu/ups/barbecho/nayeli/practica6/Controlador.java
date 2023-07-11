/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.barbecho.nayeli.practica6;

import java.awt.TextArea;
import java.io.File;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author LENOVO
 */
public class Controlador {
    public void listarDirectorios(JTextArea txtArea){
        File raiz=new File("C:/");
        File[] elementos= raiz.listFiles();
        for(File elemento:elementos){
            if(elemento.isDirectory()){
                txtArea.setText(elemento.getAbsolutePath());
                File[] subElemento=elemento.listFiles();
                if(subElemento!=null){
                    for(File subElementos:subElemento){
                        txtArea.setText(subElementos.getName());
                    }
                }
            }
        }
    }
    public void listarArchivosOcultos(){
        
    }
    public void listarDirectoriosOcutlos(){
        
    }
    public void crearDirectorios(){
         try{
            File ruta= new File("C:/carpeta2");
            if(ruta.exists()==false){
                ruta.mkdir();
            }
            File archivo=new File("C/carpeta2/hola1.txt");
            archivo.createNewFile();
            
        }catch(IOException ex){
            System.out.println("Error de lectura/escritura");
        }
    }
    public void eliminarDirectorios(){
        
    }
    public void renombrarDirectorios(){
        
    }
}
