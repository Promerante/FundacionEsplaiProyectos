package Objetos_3;

public class Pantalla{
    private String marca;
    private char catalogoEnergia;

    public Pantalla(String marca){
        this.marca = marca;
    }

    public Pantalla(){
        this.marca=null;
    }

    public  void  renderizar(){
        System.out.println(marca + ": Renderizando frames");
    }
}