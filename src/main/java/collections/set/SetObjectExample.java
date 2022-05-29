package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetObjectExample {

    public static void main(String[] args) {

        Set<Pokemon> pokedex = new LinkedHashSet<>();

        pokedex.add(new Pokemon("Bulbazaur", "Grass"));
        pokedex.add(new Pokemon("Pikatchu", "Electric"));
        pokedex.add(new Pokemon("Charmander", "Fire"));
        pokedex.add(new Pokemon("Nidoking", "Posion/Ground"));
        pokedex.add(new Pokemon("Psyduck", "Water/Psychic"));
        pokedex.add(new Pokemon("Ponyta", "Fire"));
        pokedex.add(new Pokemon("Meow", "Normal"));
        pokedex.add(new Pokemon("Machop", "Fighting"));

        for (Pokemon pokemon : pokedex) {
            System.out.println(pokemon);
        }

    }

}
