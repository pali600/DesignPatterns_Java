package com.activemesa.behavioral.strategy.exercise;

public class QuadraticEquationSolver {

	private DiscriminantStrategy strategy;

	public QuadraticEquationSolver( DiscriminantStrategy strategy ) {
		this.strategy = strategy;
	}

	public Pair<Complex, Complex> solve( double a, double b, double c ) {
		double discriminant = strategy.calculateDiscriminant( a, b, c );
		Pair<Complex, Complex> result = null;
		if ( Double.isNaN( discriminant ) ) {
			result = new Pair<>( new Complex( Double.NaN, Double.NaN ), new Complex( Double.NaN, Double.NaN ) );
		} else {
			Complex rootDiscriminant = Complex.sqrt( discriminant );

			result = new Pair<>( new Complex( -b, 0 )
					.plus( rootDiscriminant )
					.divides( new Complex( 2, 0 ) )
					.divides( new Complex( a, 0 ) ),
					new Complex( -b, 0 )
							.minus( rootDiscriminant )
							.divides( new Complex( 2, 0 ) )
							.divides( new Complex( a, 0 ) ) );
		}
		return result;
	}

}
