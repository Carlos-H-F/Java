import java.util.Scanner;

public class Guitar {
    private String modelo, serie, madeira, tipo, fabricante;
    double preco;
    int ano;
    
    public String getModelo(){
     return modelo;
}
    public String setModelo(String modelo){
        this.modelo = modelo;
        return modelo;
    }
        public String getSerie(){
     return serie;
}
    public String setSerie(String serie){
        this.serie = serie;
        return serie;
    }
    public String getMadeira(){
     return madeira;
}
    public String setMadeira(String madeira){
        this.madeira = madeira;
        return madeira;
    }        
    public String getTipo(){
     return tipo;
}
    public String setTipo(String tipo){
        this.tipo = tipo;
        return tipo;
    }
    public String getFabricante(){
     return fabricante;
}
    public String setFabricante(String fabricante){
        this.fabricante = fabricante;
        return fabricante;
    }
    public double getPreco(){
     return preco;
}
    public double setPreco(double preco){
        this.preco = preco;
        return preco;
    }
    public int getAno(){
     return ano;
}
    public int setAno(int ano){
        this.ano = ano;
        return ano;
    }
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        String modelo,serie,madeira,tipo,fabricante;
        Double preco;
        int ano;
        Guitar minhaGuitarra = new Guitar ();
        
        System.out.println("Qual e o modelo da sua guitarra: ");
        modelo = texto.nextLine();
        minhaGuitarra.setModelo(modelo);
        
        System.out.println("Qual é a serie da sua guitarra: ");
        serie = texto.nextLine();
        minhaGuitarra.setSerie(serie);   
        
        System.out.println("Qual a madeira da sua guitarra: ");
        madeira = texto.nextLine();
        minhaGuitarra.setMadeira(madeira);
        
        System.out.println("Qual é o tipo da sua guitarra: ");
        tipo = texto.nextLine();
        minhaGuitarra.setTipo(tipo);
        
        System.out.println("Qual é o fabricante da sua guitarra: ");
        fabricante = texto.nextLine();
        minhaGuitarra.setFabricante(fabricante);
        
        System.out.println("Qual é o preço da sua guitarra em reais: ");
        preco = texto.nextDouble();
        minhaGuitarra.setPreco(preco);
        
        System.out.println("Qual é o ano de fabricação da sua guitarra: ");
        ano = texto.nextInt();
        minhaGuitarra.setAno(ano);
        
        System.out.println("O modelo da sua guitarra é " + minhaGuitarra.modelo);
        System.out.println("A serie da sua guitarra é " + minhaGuitarra.serie);
        System.out.println("A madeira da sua guitarra é" + minhaGuitarra.serie);
        System.out.println("O tipo da sua guitarra é" + minhaGuitarra.tipo);
        System.out.println("O fabricante da sua guitarra é" + minhaGuitarra.fabricante);
        System.out.println("O preço da sua guitarra em reais é " + minhaGuitarra.preco);
        System.out.println("O ano de fabricação da sua guitarra é " + minhaGuitarra.ano);
                
    }
}

