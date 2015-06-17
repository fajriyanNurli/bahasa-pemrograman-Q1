public static final int MAX_LOGIN=3;
public static final String [][]users={{"root","root"},{"admin","4dm1n"},{"su","SuperSuper"}}
private static boolean doLogin(String user, String pass){
  int i=0;
  do{
    if(users[i][0].equals(user) && users[i][1].equals(pass))
      return true;
    i++;
  }while(i<users.length);
  return false;
}
public static boolean login(){
  Scanner sc=new Scanner(System.in);
  int kali=0;
  do{
  
  }
}
