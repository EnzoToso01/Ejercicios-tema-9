public class Main {
    public static void main(String[] args) {

        Cliente c= new Cliente(22,"Enzo","2613459324",2000);
        System.out.println(c.getNombre()+" "+c.getEdad()+" "+c.getTelefono()+" "+c.getCredito());
        Trabajador t= new Trabajador(33,"Ruben","2614351233",35000.0);
        System.out.println(t.getNombre()+" "+t.getEdad()+" "+t.getTelefono()+" "+t.getSalario());
    }
}