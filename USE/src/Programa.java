import java.util.Scanner;

public class Programa {
    private static Scanner scanner;
    private static Luta[] LutasAgendadas = new Luta[10];

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        Lutador prettyBoy = new Lutador("Pretty Boy", "França", 31, 1.75f, 52f, 11, 2, 1);
        Lutador putScript = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        Lutador snapShadow = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        Lutador deadCode = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        Lutador ufoCobol = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        Lutador nerdaart = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        Lutador lutador[] = { prettyBoy, putScript, snapShadow, deadCode, ufoCobol, nerdaart };
// vamos instanciar luta:

        Luta luta = new Luta();
        luta.marcarLuta(ufoCobol, nerdaart);

//Criamos uma variavel ler e inicializamos com valor 0

        int ler = 0;
        do {
            ler = gerarMenuPrincipal();
            switch (ler) {
            case 1:
                //1- Consultar dados dos lutadores 
                Lutador lutadorSelecionado = selecionarLutador(lutador);
                if (lutadorSelecionado != null) {
                    lutadorSelecionado.status();
                }
                break;
            case 2:
                //"2- Agendar lutas "

                break;
            case 3:
                //"3- Realizar lutas "

                break;
            case 4:
                //"4- Sair "

                break;
            }

        } while (ler != 4);
    }

    private static int gerarMenuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1- Consultar dados dos lutadores ");
        System.out.println("2- Agendar lutas ");
        System.out.println("3- Realizar lutas ");
        System.out.println("4- Sair ");
        return scanner.nextInt();
    }

    private static void listarLutadores(Lutador[] lutador) {
        int i;
        for (i = 0; i < lutador.length; i++) {

            System.out.println("[" + (i + 1) + "] " + lutador[i].getNome());
        }
        System.out.println("[" + (i + 1) + "] Sair");

    }

    private static void agendarLutas(Lutador[] lutador) {
        Lutador lutadorDesafiante, lutadorDesafiado;
        System.out.println("Bem-vindo ao agendamento de lutas!");
        System.out.println("Escolha o desafiante: ");
        lutadorDesafiante = selecionarLutador(lutador);
        System.out.println("Escolha o desafiado: ");
        lutadorDesafiado = selecionarLutador(lutador);
        Luta luta = new Luta();
        if (lutadorDesafiante != null && lutadorDesafiado != null) {
        //    for( int i = 0;i<  lutasAgendadas.length; i++) {
    //            if( lutasAgendadas[i] == null) {
//                    lutasAgendadas[i] = 
                }
      //}
                    
       }
        
    
    private static Lutador selecionarLutador(Lutador[] lutador) {
        int opcaoler;
        Lutador lutadorSelecionado = null;
        do {
            listarLutadores(lutador);

            System.out.println("Escolha um Lutador: ");
        
            opcaoler = scanner.nextInt();

            if (opcaoler >= 1 && opcaoler <= lutador.length) {
                System.out.println("voce escolheu o lutador :"+ lutador[opcaoler -1]);
                lutadorSelecionado = lutador[opcaoler-1];
                
                } else if (opcaoler == lutador.length + 1) {
                System.out.println("Finalizado");
                } else {
                System.out.println("Opção inválida");
            }

        } while (opcaoler != lutador.length + 1);
        return lutadorSelecionado;
    }

}