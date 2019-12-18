package com.bae.potd1;

public class CapitaliseString {

	
	public void capitaliseString() {
		String sentence = "we are the best bae cohort ever";
		System.out.println(sentence);
		System.out.println(buildSentence(capitaliseSentence(splitString(sentence))));
	}
	
	public String[] splitString(String sentence) {
		String[] words = sentence.split(" ");
		return words;
	}

	public String capitaliseWord(String word) {
		String capWord = word.toUpperCase().charAt(0) + word.substring(1);
		return capWord;
	}

	public String capitaliseAcronym(String acronym) {
		String capAcronym = acronym.toUpperCase();
		return capAcronym;
	}
	
	public String[] capitaliseSentence(String[] words) {
		String[] capWords = new String[words.length];
		for (int i=0; i<words.length; i++) {
			if (words[i].equals("bae")) {
				capWords[i] = capitaliseAcronym(words[i]);
			} else {
				capWords[i] = capitaliseWord(words[i]);
			}
		}
		return capWords;
	}

	public String buildSentence(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for (String word : words) {
			sentence.append(word + " ");
		}
		sentence.deleteCharAt(sentence.length()-1);
		return sentence.toString();
		
	}
	
	

	
	
	

}
