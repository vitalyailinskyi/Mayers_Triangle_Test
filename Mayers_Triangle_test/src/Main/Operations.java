package Main;

public class Operations {
	
	public static String ResultStr = "������� �����������";
	
	public static int FirstSide = 0, SecondSide = 0, ThirdSide = 0;
	
	public static String Result(String str) {
		str = ResultStr;
		if(FirstSide == SecondSide && SecondSide == ThirdSide){
			str = "����������� ��������������";
		}
		else{
			if(FirstSide == SecondSide){
				str = "����������� �������������� 1 � 2";
			} else if(SecondSide == ThirdSide){
				str = "����������� �������������� 2 � 3";
			} else if(FirstSide == ThirdSide){
				str = "����������� �������������� 1 � 3";
			} else if((FirstSide*FirstSide + ThirdSide*ThirdSide) == SecondSide*SecondSide){
				str = "����������� ������������� 2-�����";
			} else if((FirstSide*FirstSide + SecondSide*SecondSide) == ThirdSide*ThirdSide){
				str = "����������� ������������� 3-�����";
			} else if((SecondSide*SecondSide + ThirdSide*ThirdSide) == FirstSide*FirstSide){
				str = "����������� ������������� 1-�����";
			}	
			
			//str = ResultStr;
		}
		
		return str;
	}
}
