package sprintBeanTest2;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{

	private String title="Sgt. Peppers Lonely Hearts Club Band";
	
	private String artist="The Beatles";
	
	@Override
	public void play() {
		System.out.println("Playint "+title+" by "+artist);
	}

}
