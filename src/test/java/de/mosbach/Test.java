package de.mosbach;

import junit.framework.TestCase;

public class Test extends TestCase{
	public void testMonat(){
		Util.istErstesHalbjahr(5);
		assertTrue(Util.istErstesHalbjahr(2));
		assertTrue(Util.istErstesHalbjahr(5));
	}
}