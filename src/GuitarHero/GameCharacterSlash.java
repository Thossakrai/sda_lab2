package GuitarHero;

public class GameCharacterSlash extends GameCharacter {

	public GameCharacterSlash() {
		 guitarBehavior=new Guitar_Telecaster();
		 soloBehavior=new Solo_SmashGuitar();
		 name = "Slash";
	}
	
	public void change() {
		this.setGuitar(new Guitar_GibsonSG());
	}
	
}