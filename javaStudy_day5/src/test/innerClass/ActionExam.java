package test.innerClass;

public class ActionExam {
	
	  public static void main(String args[]){
          Action action = new Action(){
              public void exec(){
                  System.out.println("exec");
              }
          };
          action.exec();
      }
}
