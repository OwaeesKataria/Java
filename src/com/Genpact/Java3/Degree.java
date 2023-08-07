package com.Genpact.Java3;

class Degree {

    public void getDegree() {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree{
    public void getDegree(){
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree{
    public void getDegree(){
    System.out.println("I am a Postgraduate");
    }
}
class main{
    public static void main(String[] args) {
        Degree D = new Degree();
        D.getDegree();
        Undergraduate Ug = new Undergraduate();
        Ug.getDegree();
        Postgraduate Pg = new Postgraduate();
        Pg.getDegree();

    }

}