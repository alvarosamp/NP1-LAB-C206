public class Robo {
    private int energia;
    private String nome;
    static  int totalDeRobos;
    private int energiaMaxima;

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
    }

    void trabalhar(){
    int novaenergia = getEnergia();
    System.out.println("sua energia era de: "+getEnergia());
    novaenergia -=300;
    setEnergia(novaenergia);
    System.out.println("Agora sua energia é: "+getEnergia());

    }
    void trocarEnergia(Robo roboAlvo){
        int novaenergia = getEnergia();
        if(novaenergia > 0 && novaenergia < roboAlvo.energiaMaxima){
            roboAlvo.setEnergia(novaenergia);
            System.out.println("A energia de "+roboAlvo.getNome()+ " é de "+ roboAlvo.getEnergia());
        }
        else{
            System.out.println("Nao foi possivel a troca de energia");
        }
    }
    void recarregar(int horas){
        int carganova = horas * 100;
        int carga = carganova + getEnergia();
        if(carga <= energiaMaxima) {
            setEnergia(carga);
            System.out.println("Sua energia agora é " + getEnergia());
        }
        else{
            System.out.println("nao foi possivel carregar, sua energia é " +getEnergia());
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }
}
