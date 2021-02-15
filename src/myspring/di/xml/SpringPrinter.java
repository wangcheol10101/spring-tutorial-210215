package myspring.di.xml;

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
