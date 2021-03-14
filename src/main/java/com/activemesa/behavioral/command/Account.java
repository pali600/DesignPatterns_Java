package com.activemesa.behavioral.command;

public class Account {
	public int balance;

	public void process( Command c ) {
		switch ( c.action ) {
			case DEPOSIT:
				c.success = true;
				balance += c.amount;
				break;
			case WITHDRAW:
				if ( (balance - c.amount) < 0 ) {
					c.success = false;
					return;
				}
				c.success = true;
				balance -= c.amount;
				break;
		}
	}
}
