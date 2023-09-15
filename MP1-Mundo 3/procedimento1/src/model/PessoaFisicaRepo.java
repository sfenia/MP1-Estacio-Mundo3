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
public class PessoaFisicaRepo {

    private final ArrayList<PessoaFisica> pessoaFi = new ArrayList<PessoaFisica>();

    public void inserir(PessoaFisica pf) {
        pessoaFi.add(pf);
    }

    public void alterar(PessoaFisica pf) {
        for (int i = 0; i < pessoaFi.size() - 1; i++) {
            if (pf.getId() == pessoaFi.get(i).getId()) {
                pessoaFi.get(i).setNome(pf.getNome());
                pessoaFi.get(i).setIdade(pf.getIdade());
                pessoaFi.get(i).setCpf(pf.getCpf());
            }
        }
    }

    public void excluir(int id) {
        pessoaFi.remove(id);
    }

    public PessoaFisica obter(int id) {
        return pessoaFi.get(id);
    }

    public ArrayList<PessoaFisica> obterTodos() {
        return pessoaFi;
    }

    public void persistir(String arquivoModel) throws Exception {
        try {
            String str = "";
            for (int i = 0; i < pessoaFi.size(); i++) {
                //String item = pessoaFi.get(i).getId().toString();
                String item = pessoaFi.get(i).getId() + "; " + pessoaFi.get(i).getNome() + "; " + pessoaFi.get(i).getCpf() + "; " + pessoaFi.get(i).getIdade() + "; ";
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

    public void recuperar(String arquivoModel) throws Exception {
        try {
            File file = new File(
                    "C:\\dev\\CadastroPoo\\" + arquivoModel + ".bin");

            BufferedReader br
                    = new BufferedReader(new FileReader(file));

            String st;

            while ((st = br.readLine()) != null) {
                System.out.println(st);
                String[] itens = st.split(";");
                PessoaFisica pf = new PessoaFisica(itens[2].trim(), Integer.parseInt(itens[3].trim()), Integer.parseInt(itens[0].trim()), itens[1].trim());
                pessoaFi.add(pf);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            throw new Exception("Exception message");
        }
    }
}
