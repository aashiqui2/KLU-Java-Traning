package tamilnadu.courttralam;

import tamilnadu.madurai.KluCollege;

public class Parent {
    public static void main(String[] args) {
          KluCollege Parent=new KluCollege();
        //   Parent.ClassRoom();
        //!ClassRoom() is not public in KluCollege; cannot be accessed from outside package
        Parent.Canteen();
    }
}
