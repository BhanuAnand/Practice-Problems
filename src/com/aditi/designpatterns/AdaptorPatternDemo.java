package com.aditi.designpatterns;

public class AdaptorPatternDemo {

	public static void main(String[] args) {
		Pen p = new PenAdaptor();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Demo Completed!");
	}

}

interface Pen{
	public void write(String str);
}

class PilotPen{
	public void mark(String str){
		System.out.print(str);
	}
}

class PenAdaptor implements Pen{
	PilotPen pp = new PilotPen();
	
	@Override
	public void write(String str) {
		pp.mark(str);
	}
}

class AssignmentWork{
	private Pen p;
	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	
	public void writeAssignment(String str){
		p.write(str);
	}
}