public class JaceyDeng{
    String firstName;
    String lastName;
    String UCInetID;
    int studentNumber;

    JaceyDeng(String newFirstName, String newLastName, String newUCInetID, int newStudentNumber){
        firstName = newFirstName;
        lastName = newLastName;
        UCInetID = newUCInetID;
        studentNumber = newStudentNumber;
    }

    String getFullName(){
        //This method returns your full name, with spacing, as a string.
        return firstName+" "+lastName;
    }

    String getFirstName(){
        //This method returns your first name as a string.
        return firstName;
    }

    String getLastName(){
        //This method returns your last name as a string.
        return lastName;
    }

    String getUCInetID(){
        //This method returns your UCInetID as a string.
        return UCInetID;
    }

    int getStudentNumber(){
        //This method returns your UCI student number.
        return studentNumber;
    }

    String getRotatedFullName(int shift){
        //This method returns your name, rotated (with wrap-around), by shift characters.
        // Positive numbers rotate to the left, and negative numbers rotate to the right.
        String fullName = getFullName();
        if (shift > 0){
            String shiftedName = fullName.substring(0+shift, fullName.length());
            shiftedName = shiftedName.concat(fullName.substring(0, 0+shift));
            return shiftedName;
        } else if (shift < 0) {
            String shiftedName = fullName.substring(fullName.length()+shift, fullName.length());
            shiftedName = shiftedName.concat(fullName.substring(0, fullName.length()+shift));
            return shiftedName;
        }
        else {
            return fullName;
        }
    }
}