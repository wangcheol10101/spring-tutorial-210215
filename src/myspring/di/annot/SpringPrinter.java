package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("stringPrinter")
public class SpringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		this.buffer.append(message);
	}
	
	public String toString() {
		return this.buffer.toString();
	}

}
