package GuitarHero;

public class GameCharacterYoung extends GameCharacter {
    public GameCharacterYoung() {
        guitarBehavior=new Guitar_GibsonSG();
        soloBehavior=new Solo_JumpOffStage();
        name = "Young";
    }
}
