package explorandomarte;

/*
    Para controlar as sondas, a NASA envia uma simples sequência de letras. 
    As letras possíveis são "L", "R" e "M". Destas, "L" e "R" fazem a sonda 
    virar 90 graus para a esquerda ou direita, respectivamente, sem mover a sonda. 
    "M" faz com que a sonda mova-se para a frente um ponto da malha, mantendo a mesma direção.
*/
public class Sonda {
    
    private int left;
    private int right;
    private int qtdMovimento;
    private char move;
    private char car;
    private char giro;

    public Sonda() {
    }
    
    public Sonda(char giro, char move) {      
        Girar(giro);
        MoverFrente(move);
    }
    
    private int Girar(char giro) {
        this.giro = giro;
        int qtdGiro = 0;
        if (this.giro == 'R') {// Direita
            qtdGiro++;
            return this.right = (360/4) * qtdGiro;// graus --> 1/4
        } else {// Esquerda
            qtdGiro++;
            return this.left = (-90) * qtdGiro;// <-- graus
        }
    }
    
    private int MoverFrente(char mover) {
        this.move = mover;
        return qtdMovimento++;

    }
//    
//    public char ModeloCarro(char car){// dois tipos de carro
//        this.car = car;
//        
//        if (car == 'i') {// carro 1
//            return 'i';
//        }else{
//            return 'j';// carro 2
//        }
//    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }
    
    public int getQtdMovimento() {
        return qtdMovimento;
    }

    public void setQtdMovimento(int qtdMovimento) {
        this.qtdMovimento = qtdMovimento;
    }

    public char getMove() {
        return move;
    }

    public void setMove(char move) {
        this.move = move;
    }

    public char getCar() {
        return car;
    }

    public void setCar(char car) {
        this.car = car;
    }      

    public char getGiro() {
        return giro;
    }

    public void setGiro(char giro) {
        this.giro = giro;
    }
    
}
