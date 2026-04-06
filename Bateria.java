package celular;

public class Bateria {

    private int nivel;
    
    // construtor
    public Bateria(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            System.out.println("valor invalido");
            this.nivel = 0;
            
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;
        } else {
            
            
        }
    }

    public void carregar(int valor) {
        nivel += valor;
        if (nivel > 100) {
            nivel = 100;
        }
    }

    public void usar(int valor) {
        nivel -= valor;
        if (nivel < 0) {
            nivel = 0;
        }
    }
    
    
    
    public void status(int valor) {
        if (0 < 21) {
            System.out.println("Bateria fraca!");
        }
        else if(21> 70){
            System.out.println("Bateria media!");
        }
        else if(71 < 100){
            System.out.println("Bateria alta!");
            
        }
    }

    
    

    
    
}
    

   

