package one.digitalinovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author Raphael Paulino <github>raphapaulino</github>
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super(); // não é obrigatório essa chamada explícita
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
