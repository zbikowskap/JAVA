package collections.set;

import java.util.Objects;

/**
 * 1. Metody equals i hashCode pochodza z klasy Object.
 * 2. Metody equals i hashCode sluza do porownania obiektow, nienadpisane porownuja referencje do obiektu w pamieci.
 * 3. Zawsze implementujemy obie naraz. Nigdy oddzielnie.
 * 4. Nalezy zachowac kontrakt metod, jesli hashCode wychodzi inny to equals zwraca false. Jesli hashCode wychodzi ten sam,
 * to equals moze zwrocic true lub false.
 */
public class Pokemon {

    private String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " type: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(name, pokemon.name) && Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
