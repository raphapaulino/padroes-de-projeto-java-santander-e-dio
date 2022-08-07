package one.digitalinovation.gof.singleton;

/**
 * Singleton "Lazy Holder", é Static factory, Lazy initialization e Thread safe
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 *
 * @author Raphael <github>raphapaulino Lazy Holder</github>
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super(); // não é obrigatório essa chamada explícita
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
