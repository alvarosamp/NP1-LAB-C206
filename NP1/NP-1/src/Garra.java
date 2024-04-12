public class Garra {
    private int pressao;

    public Garra(int pressao) {
        this.pressao = pressao;
    }

    public int getPressao() {
        return pressao;
    }

    void agarrarpeca(int posicao){
        System.out.println("Agarrando a peça na posição "+posicao);
    }
    public void setPressao(int pressao) {
        this.pressao = pressao;
    }
}
