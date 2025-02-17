public class Punto1 {
    public void P1(int d)
    {
        Metodos M = new Metodos();
        ObjProducto[][] m = new ObjProducto[d][d];
        m = M.LlenarMatriz(d);
        M.MotrarMatrizOriginal(m);
        String Mensaje = M.BuscarProducto(m);
        System.out.println(Mensaje); 
    } 
}
