/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class ContaPoupanca extends ContaBanco {
    private double juros;
    
    public ContaPoupanca (String cliente){
        super(cliente);
        juros=0.06;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }
    
    @Override
    public double getSaldo(){
        return this.saldo + (this.saldo * this.juros);
    }
    
    
}
