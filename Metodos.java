import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjProducto[][] LlenarMatriz(int d) {
        ObjProducto[][] m = new ObjProducto[d][d];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println("Ingrese el nombre producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;
    }

    public void MotrarMatrizOriginal(ObjProducto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre Producto:" + m[i][j].getNombre());
                System.out.println("Precio Producto: " + m[i][j].getPrecio());
                System.out.println("Cantidad Producto" + m[i][j].getCantidad());
                System.out.println("");
            }
        }
    }
}
