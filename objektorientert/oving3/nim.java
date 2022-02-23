package oving3;

import java.util.ArrayList;
import java.util.List;

public class nim {
    private List<Integer> pile = new ArrayList<>();
    private int pilex;

    public nim(){
        pile.add(10);
        pile.add(10);
        pile.add(10);
    }

    public nim(int pile0, int pile1, int pile2) {
        pile.set(0, pile0);
        pile.set(1, pile0);
        pile.set(2, pile0);
    }

    private boolean isGameOver() {
        if (pile.get(0) == 0 || pile.get(1) == 0 || pile.get(2) == 0) {
            return true;
        }
        return false;
    }

    private boolean isValidMove(int number, int targetPile) {
        if (isGameOver()) {
            throw new IllegalStateException("One of the piles are empty and the game is over");
        }
        if ((targetPile == 0 || targetPile == 1 || targetPile == 2)) {
            pilex = pile.get(targetPile);
            if (number < pilex && number > 0) {
                return true;
            }
        }
        return false;
    } 

    public void removePieces(int number, int targetPile) {
        if (isValidMove(number, targetPile)) {
            pile.set(targetPile, pile.get(targetPile) - number);
        }
        else throw new IllegalArgumentException("Wrong number or pile");
    }

    public int getPile(int targetPile) {
        if (targetPile == 0 || targetPile == 1 || targetPile == 2) {
            return pile.get(targetPile);
        }
        else throw new IllegalArgumentException("Targetpile was not correct");   
    }

    @Override
    public String toString() {
        return "{" + " pile0='" + getPile(0) + "'" +
            " pile1='" + getPile(1) + "'" +
            ", pile2='" + getPile(2) + "'" +
            "}";
    }

    public static void main(String[] args) {
        nim n1 = new nim();
        System.out.println(n1.toString());
        n1.removePieces(3, 1);
        System.out.println(n1.toString());
        n1.removePieces(4, 0);
        System.out.println(n1.toString());
    }
}
