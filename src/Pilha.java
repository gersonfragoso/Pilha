public class Pilha {
    public Object[] pilha;
    public int posiçãoPilha;

    public Pilha() {
        this.posiçãoPilha = -1;
        // isso é para indicar que ela esta nula.
        //por que a posição 0 do array ja pode armazenar informação.
        this.pilha = new Object[10];

    }

    public boolean pilhaVazia() {
        if (this.posiçãoPilha == -1) {
            System.out.println("pilha vazia");// Se a posição for -1 então a pilha esta vazia;
            return true;
        }
        return false;
    }

    public int tamanhoPilha() {
        if (this.pilhaVazia()) {
            System.out.println("0");; // indicando que a pilha esta vazia
        }
        else {System.out.println(posiçãoPilha + 1);}
        return 0;
    }

    public void empilharTopo(Object valor) {
        if (this.posiçãoPilha < this.pilha.length - 1) {
            //primeiro verificar se a posição da pilha é menor que o tamanho,
            //Se for então é inserido e ao mesmo tempo feito o incremento na posição.
            this.pilha[++posiçãoPilha] = valor;
            System.out.println("objeto empilhado");
        }
    }

    public Object remover() {
        if (pilhaVazia()) { //primeiro verificar se a pilha esta vazia.
            return null;
        }
        System.out.println("removendo objeto do topo");
        return this.pilha[this.posiçãoPilha--]; // caso nao esteja retira do topo da pilha.

    }

    public Object lerTopo() {
        if (pilhaVazia()) { //primeiro verificar se a pilha esta vazia.
            System.out.println("pilha vazia");

        } else {
            System.out.println(this.pilha[this.posiçãoPilha]); //retorna o ultimo elemento da pilha no caso o do topo.
        }
        return null;
    }

    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.pilhaVazia();
        p.empilharTopo("Vasco");
        p.empilharTopo("Flamengo");
        p.empilharTopo("Fluminense");
        p.empilharTopo("Botafogo");
        p.tamanhoPilha();
        p.remover();
        p.tamanhoPilha();
        p.lerTopo();
        p.pilhaVazia();

    }
}



