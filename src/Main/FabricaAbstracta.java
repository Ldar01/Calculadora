/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Aritmetica.Aritmetico;
import Main.Convertor.Convertor;


/**
 *
 * @author LN710Q
 */
public interface FabricaAbstracta {
    
    Aritmetico getAritmetica(String type);
    Convertor getConvertor(String type);
    
}
