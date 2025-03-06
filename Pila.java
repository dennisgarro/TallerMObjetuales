import java.util.Stack;

public class Pila {
    public void pila() {
        Metodos m = new Metodos();
        Stack<Integer> p = m.LlenarPila();
        m.MostrarPila(p);
        p = m.Eliminar(p);
    }

}
