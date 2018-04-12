package game;


public class Main {

    public static void main(String[] args) {

        Board board = new Board(0);
        board.putCaseSurprise();
        board.createCharacter();
        board.chooseEquipment();
        board.moveCase();


    }

}



