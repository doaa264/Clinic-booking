
package clinic_final_project;


public class Clinic_Final_Project {


    public static void main(String[] args) {
        Clinic patient = new Clinic(4);
        System.out.println("Before delete" + "\n------------------------------------------");
        patient.enqueue(1);
        patient.enqueue(4);
        patient.enqueue(2);
        patient.enqueue(3);
        patient.display();
        System.out.println("\n\nSearch in Queue" + "\n------------------------------------------");
        patient.search(10);
        System.out.println("\n\nSorted Queue" + "\n------------------------------------------");
        System.out.print("Sorted Queue --> ");
        patient.sort();
        System.out.println("\n\nAfter delete" + "\n------------------------------------------");
        patient.dequeue();
        patient.display();
        System.out.println();
    }
    
}
