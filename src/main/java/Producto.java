public class Producto extends Precio{

    //Variable de instancia
    public int codigo;

    //Métodos públicos
    public int daCodigo(){
        return this.codigo;
    }

    public void asignaCodigo(int x){
        this.codigo=x;
    }

    public void asignaProducto(int cod, double p){
        this.asignaCodigo(cod);
        this.pone(p);
    }

    public String toString(){
        return "Código: " + codigo + "; Precio: " + euros + " euros";
    }
}
