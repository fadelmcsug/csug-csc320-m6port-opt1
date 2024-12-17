
public class AutomobileInventory {

    public static void main(String[] args) {
		Initialize an empty ArrayList automobileInventory

		Create an Automobile object car with attributes: "Toyota", "Corolla", "Red", 2020, 15000

		Print the vehicle information of car using method automobileInfoAsLines

		Attempt to remove car from automobileInventory and print the result

		Create Automobile object car1 with attributes: "Honda", "Accord", "Green", 2016, 120000
		Add car1 to automobileInventory and print the result
		Print the vehicle information of car1 using automobileInfoAsLines method

		Update the attributes of car to: "Ford", "Mustang", "Black", 2022, 5000
		Print the updated vehicle information of car using automobileInfoAsLines method
		
		Create a scanner object for user input
		Initialize response as empty string
		Initialize validResponse as false
		Print "Do you want to print the information to a file? (Y/N)"
		
		WHILE validResponse is false
		    response = get user input
		    responseYes = response equals to "Y" (case insensitive)
		    responseNo = response equals to "N" (case insensitive)
		    validResponse = responseYes OR responseNo
	
		    IF responseYes
		        TRY
		            open file "Autos.txt" for writing in program directory
		            write automobile information to file using automobileInfoAsLines method
		            print "Information printed to file."
		        CATCH IOException
		            print "An error occurred while writing to the file."
		    ELSE IF responseNo
		        print "File will not be printed."
		    ELSE
		        print "Invalid option. Please enter 'Y' or 'N'."
		END WHILE

		Close the scanner

		Define a method automobileInfoAsLines that takes a list of strings called info
		    Initialize an empty string called returnString
		    For each string i in info:
		        Append i followed by a newline character to returnString
		    Return returnString
	}

}
