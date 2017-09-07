package com.onlineinteract.conditional.command;

import com.onlineinteract.conditional.model.Type;

public class CommandA implements Command {

	public void exec(Type type) {
		System.out.println(type.getClass().getSimpleName() + " is being processed");
	}
}
