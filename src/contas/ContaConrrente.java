package contas;

public class ContaConrrente {
    String nome;
    float saldo;
    
    float Saldo() {
       return saldo;
    }
    
    void deposito(float d) {
        this.saldo = d;
    }
    
    float saque(float s) {
     if(saldo == 0) {
         return 0;
     } else {
        return s;
     }
      
    }
    
}
