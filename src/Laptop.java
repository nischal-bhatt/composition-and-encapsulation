
public class Laptop {
    private String screen;
    private Processor processor;
	public Laptop(String screen, Processor processor) {
		super();
		this.screen = screen;
		this.processor = processor;
	}
	public Laptop() {
		this.processor = new Processor();
		this.screen="sreen";
	}
	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + "]";
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
    
    
}
