public class BracoArticulado extends Robo {
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes, Garra garra, Camera camera) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        this.garra = garra;
        this.camera = camera;
    }

     void trabalhar(){


     }
    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }

    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }

    public Garra getGarra() {
        return garra;
    }

    public void setGarra(Garra garra) {
        this.garra = garra;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
