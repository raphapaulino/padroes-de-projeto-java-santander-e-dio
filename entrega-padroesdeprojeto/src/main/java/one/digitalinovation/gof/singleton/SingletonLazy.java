package one.digitalinovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * @author Raphael <github>raphapaulino</github>
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super(); // não é obrigatório essa chamada explícita
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
