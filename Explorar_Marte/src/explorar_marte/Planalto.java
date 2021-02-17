/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package explorar_marte;

/**
 * @author JefMelo
 */

public class Planalto {

    private int largura;
    private int altura;
    //private char pontosCardeais;
    //char[][] malha2D;
    public Planalto() {
    }

    public Planalto(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
        
    }
   
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

//    public char getPontosCardeais() {
//        return pontosCardeais;
//    }
//
//    public void setPontosCardeais(char pontosCardeais) {
//        this.pontosCardeais = pontosCardeais;
//    }

//    public char[][] getMalha2D() {
//        return malha2D;
//    }
//
//    public void setMalha2D(char[][] malha2D) {
//        this.malha2D = malha2D;
//    }
    
    
}
