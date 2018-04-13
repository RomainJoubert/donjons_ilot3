package game;


public class Main {

    public static void main(String[] args) {

        Board bo = new Board(64);
        bo.putCaseSurprise();
        bo.createCharacter();
        bo.chooseEquipment();
        bo.moveCase();
    }

}



 