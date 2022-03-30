
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Pedro Citadin Coelho
 */
public class Veiculo {
    private int id;
    private String nome;
    private String marca;
    private float valor;
    private int ano;
    private int nPortas;
    private int lugares;
    private boolean arCondicionado;
    private String condicao;
    private float quilometragem;
    private String cambio;
    private int combustivel;
    private int pontuacao;

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public Veiculo() {
    }

    public Veiculo(int id, String nome, String marca, float valor, int ano, int nPortas, int lugares, boolean arCondicionado, String condicao, float quilometragem, String cambio, int combustivel) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.ano = ano;
        this.nPortas = nPortas;
        this.lugares = lugares;
        this.arCondicionado = arCondicionado;
        this.condicao = condicao;
        this.quilometragem = quilometragem;
        this.cambio = cambio;
        this.combustivel = combustivel;
        
    }

   
    ////////codigos de combustivel: 
    /*Galosina: 1
    alcool: 2
    diesel: 3
    eletrico: 4
    flex: 5
    gnv: 6
    
    
    
    
    */
    
    
    
    public static List<Veiculo> iniciaLista(){
       List<Veiculo> lista = new ArrayList<Veiculo>();
       lista.add(new Veiculo(1, "C3", "Citroen", (float) 23900, 2011, 4, 5, false, "usado", (float) 91150, "manual", 5));
       lista.add(new Veiculo(2, "C4", "Citroen", (float) 32990, 2011, 4, 5, true, "usado", (float) 115000, "automatico", 5));
       lista.add(new Veiculo(3, "C4 GRAND PICASSO", "Citroen", (float) 36990, 2008, 4, 5, true, "usado", (float) 134920, "automatico", 1));
       lista.add(new Veiculo(4, "AIRCROSS", "Citroen", (float) 79900, 2020, 4, 5, true, "seminovo", (float) 16843, "automatico", 5));
       lista.add(new Veiculo(5, "C4 CACTUS", "Citroen", (float) 96900, 2021, 4, 5, true, "seminovo", (float) 5000, "automatico", 5));
       lista.add(new Veiculo(6, "CITY", "Honda", (float) 125300, 2022, 4, 5, true, "novo", (float) 0, "CVT", 5));
       lista.add(new Veiculo(7, "CIVIC", "Honda", (float) 136800, 2021, 4, 5, true, "novo", (float) 0, "CVT", 5));
//       lista.add(new Veiculo(8, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(9, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(10, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(11, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(12, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(13, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(14, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(15, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       lista.add(new Veiculo(16, "C3", "Citroen", (float) 23.900, 2011, 4, 5, false, "seminovo", (float) 91150, "manual", 5));
//       
       
       return lista;
    }
    
    

}
