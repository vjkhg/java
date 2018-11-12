package practice;
/*
 //Duplicate case values are not allowed.
//The default statement is optional.
//The break statement is used inside the switch to terminate a statement sequence.
//The break statement is optional. If omitted, execution will continue on into the next case.
 */
public class SwitchExample {

	public static void main(String args[])
	{
char ch = 'y';
   
  switch(ch)
  {
case 'r' : System.out.println("red colour");
break;

case 'y' : System.out.println("yellow colour");
break;

case 'g' : System.out.println("green coclour");
break;

 default : System.out.println("invalid colour");

  }
	
  }
  
}

/*

switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}*/