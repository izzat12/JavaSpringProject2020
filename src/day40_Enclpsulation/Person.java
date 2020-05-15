package day40_Enclpsulation;

public class Person {

    public String name;

    private long SSN;
    private int ID;

    public Person(String name){

        this.name = name;
    }

 //getter (only read)
    public long getSSN(){
        return SSN;
    }

    //setter(write only)
    public void setSSN( long SSN){this.SSN = SSN;
    }

    //getter
    public int getID(){
        return ID;
}


public void setID(int ID){
        this.ID = ID;
}

public void setSSNAndID(long SSN, int ID){
        this.SSN = SSN;
        this.ID = ID;
}


}
