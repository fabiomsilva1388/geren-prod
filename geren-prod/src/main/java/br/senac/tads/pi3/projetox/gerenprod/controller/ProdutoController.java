/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.projetox.gerenprod.controller;

import br.senac.tads.pi3.projetox.gerenprod.dao.ProdutoDAO;
import br.senac.tads.pi3.projetox.gerenprod.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caio.hcpereira
 */
public class ProdutoController {

    public static void Salvar(String nome, String descricao, double preco_compra, double preco_venda, int quantidade, boolean disponivel) {
        //Salvo na memória
        Produto pr = new Produto(nome, descricao, preco_compra, preco_venda, quantidade, disponivel);
        ProdutoDAO produto = new ProdutoDAO();
        produto.salvar(pr);
    }

    public static void Atualizar(String nome, String descricao, double preco_compra, double preco_venda, int quantidade, boolean disponivel, int id) {
        Produto pr = new Produto(nome, descricao, preco_compra, preco_venda, quantidade, disponivel, id);
        ProdutoDAO produto = new ProdutoDAO();
        produto.atualizar(pr);
    }

    public static void Excluir(int indice) {
        ProdutoDAO produto = new ProdutoDAO();
        produto.deletar(indice);
    }

    public static void ConsultaPorNome(String nome) {
        ProdutoDAO produto = new ProdutoDAO();
        produto.consultarPorNome(nome);
    }

    public static void ConsultaGeral() {
        ProdutoDAO produto = new ProdutoDAO();
        produto.consultar();
    }
    
    public static ArrayList<String[]> consultarPorNome(String nome) {
        List<Produto> produto = ProdutoDAO.consultarPorNome(nome);
        ArrayList<String[]> listaProdutos = new ArrayList<>();

        for (int i = 0; i < produto.size(); i++) {
            listaProdutos.add(new String[]{String.valueOf(produto.get(i).getId()),
                String.valueOf(produto.get(i).getNome()),
                String.valueOf(produto.get(i).getDescricao()),
                String.valueOf(produto.get(i).getPreco_compra()),
                String.valueOf(produto.get(i).getPreco_venda()),
                String.valueOf(produto.get(i).getQuantidade())});

        }
        return listaProdutos;

    }

}
