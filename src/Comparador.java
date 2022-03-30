
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Pedro Citadin Coelho
 */
public class Comparador {
    private List<Veiculo> listaV;

    public List<Veiculo> getListaV() {
        return listaV;
    }

    public void setListaV(List<Veiculo> listaV) {
        this.listaV = listaV;
    }
    
    
    public Veiculo analisador(float valor, String cambio){
        List<Veiculo> listaAux = new ArrayList<Veiculo>();
        listaAux.addAll(listaV);
        ///////////verifica faixa de preço
        int ind = listaV.size();
        for(int i =0; i<ind; i++) {
            
            if (listaAux.get(i).getValor()>valor) {
                listaV.remove(listaAux.get(i));
            }
        }
        
        
        if (listaV.size()==1) {
            
            return listaV.get(0);
        }
        listaAux.clear();
        listaAux.addAll(listaV);
        ind = listaV.size();
         
        for(int i =0; i<ind; i++) {
            
            if (!listaAux.get(i).getCambio().equalsIgnoreCase(cambio)) {
                listaV.remove(listaAux.get(i));
            }
        }
        if (listaV.size()==1) {
            
            return listaV.get(0);
        }
        return null;
    }
}
