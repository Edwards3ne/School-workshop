import Pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
    public static void main(String[] args) {
        List<Pokemon> pokemonListOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "grass", "water");

        // Which pokemon should Ash use?
        // Write the necessary code to get the name of the right pokemon and print it:
        String rightPokemon="";
        for (int i = 0; i < pokemonListOfAsh.size(); i++) {
            if (wildPokemon.type==pokemonListOfAsh.get(i).effectiveAgainst&&wildPokemon.effectiveAgainst!=
                    pokemonListOfAsh.get(i).type){
                rightPokemon= pokemonListOfAsh.get(i).name;
            }
        }

        System.out.print("I choose you, "+ rightPokemon);
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Bulbasaur", "grass", "water"));
        pokemon.add(new Pokemon("Pikachu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "grass"));
        pokemon.add(new Pokemon("Pidgeot", "flying", "fighting"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}