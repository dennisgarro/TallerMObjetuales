public class Punto5 {
    public void p5(int d) {
        Metodos M = new Metodos();
        ObjProducto[][] m1 = new ObjProducto[d][d];
        ObjProducto[][] m2 = new ObjProducto[d][d];
        ObjProducto[][] m3 = new ObjProducto[d][d * d];
        m1 = M.LlenarMatriz(d);
        m2 = M.LlenarMatriz(d);
        M.MotrarMatrizOriginal(m1);
        M.MotrarMatrizOriginal(m2);
        m3 = M.FusionarMatrices(m1, m2, m3);
        M.MotrarMatrizOriginal(m3);
    }
}
