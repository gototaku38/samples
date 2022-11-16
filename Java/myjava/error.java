public class error{
public static void main(String[] args){

String[] a={"dog","cat","mokey","fox","turtle"};

try{

for(int i=0;i<=5;i++){

System.out.println(a[i]);
}
}

catch(Exception e){
System.out.println("error");
}

finally{
System.out.println("finish");
}

}

}