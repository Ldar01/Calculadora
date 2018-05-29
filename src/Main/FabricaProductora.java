/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Aritmetica.FabricaDeAritmetica;
import Main.Convertor.FabricaDeConversion;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaProductora {
    public static FabricaAbstracta getFactory(String type){
        switch(type){
            case "Aritmetica":
                return new FabricaDeAritmetica();
            case "Conversion":
                return new FabricaDeConversion();
        }
        return null;
    }
}
