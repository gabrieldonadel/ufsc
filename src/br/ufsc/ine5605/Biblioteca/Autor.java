package br.ufsc.ine5605.Biblioteca;
public class Autor {
    
    private int codigo;
    private String nome;
    
    public Autor(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
}