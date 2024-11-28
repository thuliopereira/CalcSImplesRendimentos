/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcinvest;

/**
 *
 * @author thulio.pereira
 */
public class Calcinvest {

    public static void main(String[] args) {
        float invest;
        float investIni;
        int meses;
        int mesesCont;
        float result;
        int cont;
        float aporte;
        float reajuste;
        
        
        invest = investIni = 20000;
        meses = 240;
        mesesCont = 1; //Não alterar
        aporte = 0;
        reajuste = 0;
        System.out.println("Mes 0: " + invest);
        for (cont = 1; cont <= meses; cont++){
            invest = ((invest / 100) + invest );
            System.out.println("Mes " + cont + ": " + invest + "     |||    Ciclo ano: " + mesesCont + "       Aporte: " + aporte + "      Reajuste: " + reajuste);
            invest = invest + aporte;
            mesesCont = mesesCont + 1;
            if (mesesCont > 12){
                aporte = aporte + ((aporte / 100) * reajuste);
                mesesCont = 1;
            }
        }
       System.out.println("___________________________");
       System.out.println("/// Investimento inicial: " + investIni);
       System.out.println("/// Valor obtido ao final de " + meses + " meses: " + invest);
       System.out.println("/// Lucro: " + (invest - investIni));

       //invest = 20000;
       // int ano = 10;
       // for (cont = 0; cont != ano; cont++){
       //     invest = (((invest / 100) * 12 ) + invest );
       //     System.out.println("ano " + cont + ": " + invest);
       // } 
    }
}
