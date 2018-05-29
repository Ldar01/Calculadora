/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Aritmetica;

import Main.Convertor.Convertor;
import Main.FabricaAbstracta;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaDeAritmetica implements FabricaAbstracta {

    @Override
    public Aritmetico getAritmetica(String type) {
        switch(type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Multiplicacion": 
                return new Multiplicacion();
            case "Division":
                return new Division();
        }
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        return null;
    }
    
}
