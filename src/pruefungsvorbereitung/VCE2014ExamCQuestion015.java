package pruefungsvorbereitung;

public class VCE2014ExamCQuestion015 {

class Super {
private int a;
protected Super(int a) { this.a = a; }
}

class Sub extends Super {
public Sub(int a) { super(a); }

// Doesn´t compile:
// public Sub() { this.a = 5; }

// Compiles:
public Sub() { this(5); }

//Compiles:
// public Sub() { super(5); }
}
}
