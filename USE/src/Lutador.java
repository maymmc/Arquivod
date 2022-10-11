public class Lutador {
//atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private Categoria categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

//metodo-construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
            int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empate;
    }

//metodos
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }

    public void status() {
        System.out.println("************************************");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
        System.out.println("************************************");
    }
//tres formas diferentes de fazer: retornando com o método,com atributos...
    public void ganharLuta() {
        System.out.println("Ganhando luta");
        this.setVitorias(getVitorias() + 1);
        this.status();
    }

    public void perderLuta() {
        System.out.println("Perdeu luta");
        derrotas++;
        this.status();
    }

    public void empatarLuta() {
        System.out.println("Empatou");
        this.empates = this.empates + 1;
        this.status();
    }

    // getter and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
//Toda vez q chamar peso, vai modificar a categoria(pq é classificada de acordo com o peso!
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
//privada pra ninguem mexer nela de forma externa!
    private void setCategoria() {
        if (peso < 52.2) {
            this.categoria = Categoria.Invalido;
        } else if (this.peso <= 70.3) {
            this.categoria = Categoria.pesoLeve;
        } else if (this.peso <= 83.9) {
            this.categoria = Categoria.pesoMedio;
        } else if (this.peso <= 120.2) {
            this.categoria = Categoria.pesoPesado;
        } else
            this.categoria = Categoria.Invalido;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}