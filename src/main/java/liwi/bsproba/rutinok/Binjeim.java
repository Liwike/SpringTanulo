package liwi.bsproba.rutinok;

import org.springframework.stereotype.Component;

@Component
public class Binjeim implements IBinjeim<Integer> {

	@Override
	public Integer szorzo(Integer a, Integer b) {
		return a * b;
	}

}
