package Main;

public class Operations {
	
	public static String Result(int FirstSide, int SecondSide, int ThirdSide) {
		
		if(FirstSide + SecondSide <= ThirdSide){
			return "";
		} else if(FirstSide + ThirdSide <= SecondSide){
			return "";
		} else if(SecondSide + ThirdSide <= FirstSide){
			return "";
		} else{ 		
			if(FirstSide == SecondSide && SecondSide == ThirdSide){
				str = "This is equilateral triangle.";
			}
			else{
				if(FirstSide == SecondSide){
					str = "This is isosceles triangle. 1 and 2 sides are equal.";
				} else if(SecondSide == ThirdSide){
					str = "This is isosceles triangle. 2 and 3 sides are equal.";
				} else if(FirstSide == ThirdSide){
					str = "This is isosceles triangle. 1 and 3 sides are equal.";
				} else if((FirstSide*FirstSide + ThirdSide*ThirdSide) == SecondSide*SecondSide){
					str = "This is right triangle. 2 side is hypotenuse.";
				} else if((FirstSide*FirstSide + SecondSide*SecondSide) == ThirdSide*ThirdSide){
					str = "This is right triangle. 3 side is hypotenuse.";
				} else if((SecondSide*SecondSide + ThirdSide*ThirdSide) == FirstSide*FirstSide){
					str = "This is right triangle. 1 side is hypotenuse.";
				}	
			}	
			return str;
		}
	}
}
