package com.activemesa.behavioral.observer.oando;

// observes objects of type T
public interface Observer<T> {
	void handle( PropertyChangedEventArgs<T> args );
}
