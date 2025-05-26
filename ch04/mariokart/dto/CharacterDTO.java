package ch04.mariokart.dto;

import javax.lang.model.element.NestingKind;

public class CharacterDTO {
	
	public String name ; // 캐릭터명
	public double weight ; // 무게
	public double speed ; // 속도
	public double acceleration ; // 가속
	public double handling ; // 핸들링
	public double friction ; // 마찰력

	public CharacterDTO(String name, double weight, double speed,
			double acceleration, double handling, double friction) {
		// CharacterDTO characterDTO = new CharacterDTO(파라미터);
		
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		this.acceleration = acceleration ;
		this.handling = handling ;
		this.friction = friction ;
	}

	public String toString() {
		
		
		return name ;

	}
	
}
