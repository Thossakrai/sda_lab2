package GuitarHero;

public class GameCharacterHendrix extends GameCharacter {

	
	public GameCharacterHendrix() {
		 guitarBehavior=new Guitar_GibsonSG();
		 soloBehavior=new Solo_PutGuitarOnFire();
		 name = "Hendrix";
	}
}
