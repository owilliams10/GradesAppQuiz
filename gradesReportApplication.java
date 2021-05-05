package gradesReportAppAssignment;

public class gradesReportApplication {

	public static void main(String[] args) {
		
		int[] grades = {87, 90, 80, 100, 95, 70, 65, 100, 72, 56};
		
		Students Toni = new Students ();
		Students Bryan = new Students ();
		Students Chris = new Students ();
		Students Shelby = new Students ();
		Students Alex = new Students ();
		Students Tyler = new Students ();
		Students Erin = new Students ();
		Students Ben = new Students ();
		Students Tiffany = new Students ();
		Students Sarah = new Students ();
		
		Toni.name = "Toni";
		Bryan.name = "Bryan";
		Chris.name = "Chris";
		Shelby.name = "Shelby";
		Alex.name = "Alex";
		Tyler.name = "Tyler";
		Erin.name = "Erin";
		Ben.name = "Ben";
		Tiffany.name = "Tiffany";
		Sarah.name = "Sarah";
		
		Toni.grade = grades[0];
		Bryan.grade = grades[1];
		Chris.grade = grades[2];
		Shelby.grade = grades[3];
		Alex.grade = grades[4];
		Tyler.grade = grades[5];
		Erin.grade = grades[6];
		Ben.grade = grades[7];
		Tiffany.grade = grades[8];
		Sarah.grade = grades[9];
		
		int highestGrade = grades[0];
		int lowestGrade = grades[0];
		
		for(int i = 0; i < grades.length; i++) {
			if (grades[i] > highestGrade) {
				highestGrade = grades[i];
			}
		}
		
		for(int i = 0; i < grades.length; i++) {
			if (grades[i] < lowestGrade) {
				lowestGrade = grades[i];
			}
		}
		
		int sum = 0;
		int avg;
		int i = 0;
		
		for(i = 0; i < grades.length; i++) {
			sum +=grades[i];
		}
		
		avg = sum / grades.length;
		
		System.out.println("The highest grade in the class is " + highestGrade + ".");
		
		System.out.println("The lowest grade in the class is " + lowestGrade + ".");
		
		System.out.println("The average grade in the class is " + avg + ".");
		
		
		
		

	}

}
