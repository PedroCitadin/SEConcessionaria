
/**
 *
 * @author Pedro Citadin Coelho
 */
public class Main {
    public static void main(String[] args) {
        Comparador comp = new Comparador();
        comp.setListaV(Veiculo.iniciaLista());
        
        Veiculo ve = comp.analisador(33000, "automatico");
        System.out.println(ve.getMarca()+" "+ve.getNome());
    }
}
