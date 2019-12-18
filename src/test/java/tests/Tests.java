package tests;

import org.junit.Assert;
import org.junit.Test;

import com.bae.potd1.CapitaliseString;

public class Tests {
	
	CapitaliseString capitaliseString = new CapitaliseString();
	String sentence = new String();
	String[] words;

	@Test
	public void splitStringTest() {
		String sentence = "press winkey or forever hold your piece";
		String[] words = {"press","winkey","or","forever","hold","your","piece"};
		Assert.assertArrayEquals(words, capitaliseString.splitString(sentence));
	}
	
	@Test
	public void capitaliseWordTest() {
		String word = "press";
		String capitalisedWord = "Press";
		Assert.assertEquals(capitalisedWord, capitaliseString.capitaliseWord(word));
	}
	
	@Test
	public void capitaliseAcronymTest() {
		String acronym = "cia";
		String capitalisedAcronym = "CIA";
		Assert.assertEquals(capitalisedAcronym, capitaliseString.capitaliseAcronym(acronym));
	}
	
	@Test
	public void capitaliseSentenceTest() {
		String[] words = {"test","sentence","with","an","acronym","like","bae"};
		String[] capWords = {"Test","Sentence","With","An","Acronym","Like","BAE"};
		Assert.assertArrayEquals(capWords, capitaliseString.capitaliseSentence(words));
	}
	
	@Test
	public void buildSentenceTest() {
		String[] words = {"press","winkey","or","forever","hold","your","piece"};
		String sentence = "press winkey or forever hold your piece";
		Assert.assertEquals(sentence, capitaliseString.buildSentence(words));
	}

}
