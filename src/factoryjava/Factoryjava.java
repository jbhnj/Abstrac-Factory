package factoryjava;

import java.io.IOException;

import javax.swing.JFrame;

import interfaces.IBuilder;
import interfaces.IFactory;

public class Factoryjava implements IFactory{

	@Override
	public JFrame SyntaxHG(String dir) throws IOException {
		// TODO Auto-generated method stub
		return new Syntaxjava(dir);
		
	}

	@Override
	public IBuilder Builder() {
		// TODO Auto-generated method stub
		return new BuilderJava();
	}

}
