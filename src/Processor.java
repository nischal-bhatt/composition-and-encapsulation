
public class Processor {
	private String brand;

	public Processor(String brand) {

		this.brand = brand;
	}

	public Processor() {
		this.brand = "somebrand";
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + "]";
	}

}
