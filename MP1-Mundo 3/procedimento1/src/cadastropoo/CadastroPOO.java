/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

/**
 *
 * @author Usuario
 */
public class CadastroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        repo1.inserir(new PessoaFisica("00111122200", 35, 001, "Maria Luiza da Silva"));
        repo1.inserir(new PessoaFisica("00122233301", 40, 002, "José da Silva Gonçalves"));

        repo1.persistir("pessoa-fisicaRepo1");
        
        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
        repo2.recuperar("pessoa-fisicaRepo1");
        
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        repo3.inserir(new PessoaJuridica("00111222/0001-99", 003,"Jose enterprise"));
        repo3.inserir(new PessoaJuridica("00222333/0001-88", 004,"Maria enterprise"));
        repo3.persistir("pessoa-juridicaRepo3");
        
        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
        repo4.recuperar("pessoa-juridicaRepo3");
        
        
        
        
        
    }
    

}
