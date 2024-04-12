//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacote[] pacotes = new Pacote[5];
        pacotes[0] = new Pacote(300);
        pacotes[1] = new Pacote(400);
        pacotes[2] = new Pacote(100);

        Empilhador empilhador = new Empilhador(1000,"Mario",300,pacotes,3000);

        Garra garra = new Garra(200);
        Camera camera = new Camera(10);

        BracoArticulado bracoarticulado = new BracoArticulado(2000,"Moto",600,4,garra,camera);

        Robo robo = new Robo(1500,"bob",3000);
        Robo robo1 = new Robo(1000,"Homer",1600);
        Robo robo3 = new Robo(200,"Marge", 1000);

        Robo.totalDeRobos = 3;
       // robo.trocarEnergia(robo1);
        // robo1.trocarEnergia(robo3);
       // robo1.recarregar(7);
      //  robo.trabalhar();

       // empilhador.mostraPacotes();
        //empilhador.adicionaPacote(200);
       // empilhador.mostraPacotes();
        //empilhador.removePacote(1);
       // empilhador.mostraPacotes();


        //camera.acharpecas();
       // garra.agarrarpeca(2);




    }
}