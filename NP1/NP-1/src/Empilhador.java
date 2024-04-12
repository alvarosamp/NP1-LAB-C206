public class Empilhador extends Robo{
    private Pacote[] pacotes;
    private int pesoMaximo;

    public Empilhador(int energia, String nome, int energiaMaxima, Pacote[] pacotes, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pacotes = pacotes;
        this.pesoMaximo = pesoMaximo;
    }

    void adicionaPacote(int peso){
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[i] == null){
                Pacote novopacote = new Pacote(peso);
                pacotes[i] = novopacote;
                break;
            }
            else {
                System.out.println("Nao foi possivel adicionar");
            }

        }

    }
    void removePacote(int posicao){
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[posicao] != null){
                pacotes[posicao] = null;
                System.out.println("Pacote apagado");
            }
            else{
                System.out.println("Pacote nao encontrado");
            }

        }

    }
    void mostraPacotes(){
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[i]!= null){
                System.out.println(pacotes[i].getPeso());
            }
        }
    }
    public Pacote[] getPacotes() {
        return pacotes;
    }

    public void setPacotes(Pacote[] pacotes) {
        this.pacotes = pacotes;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
}
