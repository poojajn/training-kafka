package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JsTest02 {

	public static void main(String[] args)throws FileNotFoundException,ScriptException {
		ScriptEngineManager scriptEngineManager=new ScriptEngineManager();
		ScriptEngine nashorn=scriptEngineManager.getEngineByName("nashorn");
		nashorn.eval(new FileReader("/resources/external.js"));
		System.out.println(nashorn.eval("fnTest()"));
		System.out.println(nashorn.eval("sayHello('harry')"));
	}

}
