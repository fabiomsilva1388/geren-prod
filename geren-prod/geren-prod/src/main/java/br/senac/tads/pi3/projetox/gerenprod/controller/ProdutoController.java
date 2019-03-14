/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.projetox.gerenprod.controller;

import br.senac.tads.pi3.projetox.gerenprod.dao.ProdutoDAO;
import br.senac.tads.pi3.projetox.gerenprod.model.Produto;

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

    public static void Atualizar(String nome, String descricao, double preco_compra, double preco_venda, int quantidade, boolean disponivel) {
        Produto pr = new Produto(nome, descricao, preco_compra, preco_venda, quantidade, disponivel);
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
}
