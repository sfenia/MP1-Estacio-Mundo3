/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PessoaJuridicaRepo {
    private final ArrayList<PessoaJuridica> pessoaJu = new ArrayList<PessoaJuridica>();
    
    public void inserir(PessoaJuridica pj) {
        pessoaJu.add(pj);
    }
    public void alterar(PessoaJuridica pj) {
        for(int i = 0; i < pessoaJu.size()-1; i++){
            if(pj.getId()== pessoaJu.get(i).getId()) {
                pessoaJu.get(i).setNome(pj.getNome());
                pessoaJu.get(i).setCnpj(pj.getCnpj());
                pessoaJu.get(i).setId(pj.getId());
            }
        }
    }
    public void excluir(int id) {
        pessoaJu.remove(id);
    }
    public PessoaJuridica obter(int id) {
        return pessoaJu.get(id);
    }
    public ArrayList<PessoaJuridica> obterTodos() {
        return pessoaJu;
    }
    public void persistir(String arquivoModel) throws Exception {
        try {
            String str = "";
            for (int i = 0; i < pessoaJu.size(); i++) {
                //String item = PessoaJu.get(i).getId().toString();
                String item = pessoaJu.get(i).getId() + "; " + pessoaJu.get(i).getNome() + "; " + pessoaJu.get(i).getCnpj()+ "; ";
                str = str + item + "\n";
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\dev\\CadastroPoo\\" + arquivoModel + ".bin"));
            writer.write(str);

            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            throw new Exception("Exception message");
        }
    }
    public void recuperar(String arquivoModel) throws Exception{
        try {
            File file = new File(
                    "C:\\dev\\CadastroPoo\\" + arquivoModel + ".bin");

            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            String st;

            while ((st = br.readLine()) != null) {
                System.out.println(st);
                String[] itens = st.split(";");
                PessoaJuridica pj = new PessoaJuridica(itens[2].trim(), Integer.parseInt(itens[0].trim()), itens[1].trim());
                pessoaJu.add(pj);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            throw new Exception("Exception message");
        }
    }
    
    
}
