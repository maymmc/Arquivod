   public void lutar() {
        if (this.aprovada) {
            System.out.println("Apresentamos os lutadores " + ":  " + desafiante.getNome() + " " + desafiado.getNome());
            System.out.println("Na esquina esquerda: ");
            desafiante.apresentar();
            System.out.println("Na esquina direita: ");
            desafiado.apresentar();
            Random random = new Random();
            int aleatorio = random.ints(0, 2).findFirst().getAsInt();
            switch (aleatorio) {
            case 0:
                System.out.println("Luta empatada");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
                break;
            case 1:
                System.out.println(" O vencedor é " + desafiante.getNome());
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
            case 2:
                System.out.println(" O vencedor é " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            }
        } else {
            System.out.println("A luta não foi aprovada");
        }
    }
}
//random: Gera numeros de maneira aleatória, da int entre 0 e 2 e o primeiro inteiro ele vai retornar.
//   0 empate/ 1 vitoria ao desafiante/ 2 vitoria desafiado

// Regras de Luta:
//    Somente lutadores da mesma categoria
//    Lutadores diferentes deles próprios 
//    Só pode acontecer se a luta tiver sido aprovada 
//    Deve ter vitória de alguém ou empate