package com.activemesa.structural.flyweight.exercise;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private String plainText;
	private List<WordToken> wordTokens = new ArrayList<>();

	public Sentence( String plainText ) {
		this.plainText = plainText;
	}

	public WordToken getWord( int index ) {
		WordToken wordToken = new WordToken( index );
		wordToken.capitalize = true;
		wordTokens.add( wordToken );
		return wordToken;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String[] words = plainText.split( " " );
		for ( int i = 0; i < words.length; i++ ) {
			for ( WordToken wordToken : wordTokens ) {
				if ( i == wordToken.index && wordToken.capitalize ) {
					sb.append( words[ i ].toUpperCase() );
					appendSpace( sb, words, i );
					break;
				} else {
					sb.append( words[ i ] );
					appendSpace( sb, words, i );
				}
			}

		}
		return sb.toString();
	}

	private void appendSpace( StringBuilder sb, String[] words, int i ) {
		if ( i + 1 != words.length ) {
			sb.append( " " );
		}
	}

	class WordToken {
		private int index;
		public boolean capitalize;

		public WordToken( int index ) {
			this.index = index;
		}
	}

}
