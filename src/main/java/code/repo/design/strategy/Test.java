package code.repo.design.strategy;

public class Test {

	public static void main(String[] args){
		
		Team teamArgentina = new TeamArgentina();
		Team teamGermany = new TeamGermany();
		
		TeamStrategy attack = new AttackStrategy();
		TeamStrategy defense = new DefendStrategy();
		
		teamArgentina.setTeamName("Argentina");
		teamArgentina.setTeamStrategy(attack);
		teamArgentina.playGame();
	}
}
