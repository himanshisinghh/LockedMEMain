package lockedme.com;

public class lockedMeMain {

	public static void main(String[] args) {
		// Create "main" folder if not present in current folder structure
				FileOperations.createMainFolderIfNotPresent("main");
				
				MenuListOptions.printWelcomeScreen("LockedMe", "HIMANSHI SINGH");
				

			}
	}

