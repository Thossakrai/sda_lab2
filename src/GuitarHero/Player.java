package GuitarHero;


public class Player {
    private GameCharacter gameCharacter;

    public Player(GameCharacter c) {
        this.gameCharacter = c;
    }

    public void start() {
//        String char_name = JOptionPane.showInputDialog("Please Input character name: \n[Hendrix, Slash, Young]");
        gameCharacter.playGuitar();
        gameCharacter.playSolo();
    }

}
