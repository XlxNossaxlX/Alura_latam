public class Compra implements Comparable<Compra> {
    private double valor;
    private String descripcion;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Descripción: " + descripcion + ", Valor: " + valor;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.compare(this.valor, otraCompra.getValor());
    }
}