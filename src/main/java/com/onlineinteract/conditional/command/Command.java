package com.onlineinteract.conditional.command;

import com.onlineinteract.conditional.model.Type;

public interface Command {
	void exec(Type type);
}