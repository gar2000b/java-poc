package com.onlineinteract.conditional;

import java.util.HashMap;
import java.util.Map;

import com.onlineinteract.conditional.command.Command;
import com.onlineinteract.conditional.command.CommandA;
import com.onlineinteract.conditional.command.CommandB;
import com.onlineinteract.conditional.command.CommandC;
import com.onlineinteract.conditional.model.Type;
import com.onlineinteract.conditional.model.TypeB;

public class ObjectConditional<T extends Type> {

	private Map<String, Command> commandMap = new HashMap<>();
	
	public ObjectConditional() {
		commandMap.put("TypeA", new CommandA());
		commandMap.put("TypeB", new CommandB());
		commandMap.put("TypeC", new CommandC());
	}

	public void processType(T type) {
		commandMap.get(type.getClass().getSimpleName()).exec(type);
	}

	public static void main(String[] args) {
		new ObjectConditional<Type>().processType(new TypeB());
	}
}
