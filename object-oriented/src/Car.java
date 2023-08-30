
public class Car {
private String model;
private String[] features;
public Car(String model, String... features) {
	super();
	this.model = model;
	this.features = features;
}
public void specs() {
	System.out.println("Features of "+ model);
	for(String f: features)
		System.out.println("> "+f);
}
public static void main(String[] args) {
	
	Car alto = new Car("Suzuki Alto","Keyless","AC","Power Window" );
	alto.specs();
	
	Car astor = new Car("MG Astor","ABS","AC","Auto","Sunroof");
	astor.specs();
}
}
