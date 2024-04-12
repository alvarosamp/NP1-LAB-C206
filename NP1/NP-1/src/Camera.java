public class Camera {
    private int qualidade;

    public Camera(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    int acharpecas(){
         int variavel = (int) ((Math.random() * 9) + 1);
        System.out.println(variavel);
        return (int) ((Math.random() * 9) + 1);
    }


}
