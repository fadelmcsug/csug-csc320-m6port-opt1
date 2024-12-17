import java.util.List;

public class Automobile {
 	private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
    	Set make to "unknown"
        Set model to "unknown"
        Set color to "unknown"
        Set year to 0
        Set mileage to 0
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        Set this.make to make
        Set this.model to model
        Set this.color to color
        Set this.year to year
        Set this.mileage to mileage
    }

    // Add a new vehicle method
    public String addVehicle(List<Automobile> list) {
        Try
		    Add this to list
		    Return "Vehicle added successfully."
	    Catch Exception
        	Return "Failed to add vehicle."
    }

    // List vehicle information method
    public String[] listVehicle() {
        Return Array of make, model, color, year, mileage
    }

    // Remove vehicle method
    public String removeVehicle(List<Automobile> list) {
        Try
        	If Remove this from list true
        		Return "Vehicle removed successfully."
    		Else
    			Return "Vehicle to remove not found."
        Catch Exception
        	Return "Failed to remove vehicle."
    }

    // Update vehicle attributes method
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        Try
	        Set this.make to make
	        Set this.model to model
	        Set this.color to color
	        Set this.year to year
	        Set this.mileage to mileage
	        Return "Vehicle updated successfully."
        Catch Exception
        	Return "Failed to update vehicle."
    }
}
