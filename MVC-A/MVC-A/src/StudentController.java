/**
 * The StudentController class acts as a bridge between the Student model and the StudentView.
 * It retrieves data from the model, updates the view, and handles user input.
 *
 * @author Hasnain Saleem
 */
public class StudentController {
    private Student model;
    private StudentView view;

    /**
     * Constructs a StudentController with the specified model and view.
     *
     * @param model the Student model
     * @param view the Student view
     */
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Sets the student's name in the model.
     *
     * @param name the name of the student
     */
    public void setStudentName(String name) {
        model.setName(name);
    }

    /**
     * Gets the student's name from the model.
     *
     * @return the name of the student
     */
    public String getStudentName() {
        return model.getName();
    }

    /**
     * Sets the student's roll number in the model.
     *
     * @param rollNo the roll number of the student
     */
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    /**
     * Gets the student's roll number from the model.
     *
     * @return the roll number of the student
     */
    public String getStudentRollNo() {
        return model.getRollNo();
    }

    /**
     * Sets the student's details in the model by retrieving them from the view.
     * This method prompts the view to get the student details and then updates the model.
     */
    public void setStudent() {
        String[] details = view.setStudentDetails();
        model.setName(details[0]);
        model.setRollNo(details[1]);
    }

    /**
     * Updates the view with the student's details from the model.
     * This method calls the view to print the student details.
     */
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
