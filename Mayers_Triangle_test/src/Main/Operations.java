package Main;

public class Operations {
	
	public static String ResultStr = "Обычный теругольник";
	
	public static int FirstSide = 0, SecondSide = 0, ThirdSide = 0;
	
	public static String Result(String str) {
		str = ResultStr;
		if(FirstSide == SecondSide && SecondSide == ThirdSide){
			str = "Треугольник равносторонний";
		}
		else{
			if(FirstSide == SecondSide){
				str = "Треугольник равнобедренный 1 и 2";
			} else if(SecondSide == ThirdSide){
				str = "Треугольник равнобедренный 2 и 3";
			} else if(FirstSide == ThirdSide){
				str = "Треугольник равнобедренный 1 и 3";
			} else if((FirstSide*FirstSide + ThirdSide*ThirdSide) == SecondSide*SecondSide){
				str = "Треугольник прямоугольный 2-гипот";
			} else if((FirstSide*FirstSide + SecondSide*SecondSide) == ThirdSide*ThirdSide){
				str = "Треугольник прямоугольный 3-гипот";
			} else if((SecondSide*SecondSide + ThirdSide*ThirdSide) == FirstSide*FirstSide){
				str = "Треугольник прямоугольный 1-гипот";
			}	
			
			//str = ResultStr;
		}
		
		return str;
	}
}
