package com.activemesa.behavioral.state.exercise;

public class CombinationLock {

	private int[] combination;
	public String status;

	public CombinationLock( int[] combination ) {
		this.combination = combination;
		status = SafeStatus.LOCKED.name();
	}

	public void enterDigit( int digit ) {
		if ( SafeStatus.LOCKED.name().equals( status ) ) {
			status = String.valueOf( digit );
		} else {
			status = status.concat( String.valueOf( digit ) );
		}

		for ( int i = 0; i < status.length(); i++ ) {
			Integer statusDigit = Character.getNumericValue( status.charAt( i ) );
			if ( combination[ i ] != statusDigit.intValue() ) {
				status = SafeStatus.ERROR.name();
				return;
			}
		}
		if ( combination.length == status.length() ) {
			status = SafeStatus.OPEN.name();
		}
	}

}
