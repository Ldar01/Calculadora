/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main.Convertor;

import Main.Aritmetica.Aritmetico;
import Main.FabricaAbstracta;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class FabricaDeConversion implements FabricaAbstracta{

    @Override
    public Aritmetico getAritmetica(String type) {
        return null;
    }

    @Override
    public Convertor getConvertor(String type) {
        switch(type){
            case "Binario":
                return new Binario();
            default:
                break;
        }
        return null;
    }

}
