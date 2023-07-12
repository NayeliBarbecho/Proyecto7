/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.barbecho.nayeli.controlador;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Adrian
 */
public class controladorArchivos {

    public void agregarCarpetasYArchivos(String ruta, DefaultMutableTreeNode nodoPadre, int opcion) {
        File archivo = new File(ruta);
        File[] elementos = archivo.listFiles();
        if (elementos != null) {
            int i = 0;
            while (i < elementos.length) {
                File elemento = elementos[i];
                switch (opcion) {
                    case 1:
                        if (elemento.isDirectory()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(elemento.getName());
                            nodoPadre.add(nodo);
                            agregarCarpetasYArchivos(elemento.getAbsolutePath(), nodo, 1);
                        }
                        break;
                    case 2:
                        if (elemento.isDirectory() && elemento.isHidden()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(elemento.getName());
                            nodoPadre.add(nodo);
                            agregarCarpetasYArchivos(elemento.getAbsolutePath(), nodo, 2);
                        }
                        break;
                    case 3:
                        if (elemento.isFile() && elemento.isHidden()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(elemento.getName());
                            nodoPadre.add(nodo);
                            agregarCarpetasYArchivos(elemento.getAbsolutePath(), nodo, 3);
                        }
                        break;
                    default:
                        break;
                }
                i++;
            }
        }
        

    }
    

}
