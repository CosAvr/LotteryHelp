public class CommLinArgum {
	
		


    public static void main(String[] args) {
	int [][] go  = new int[3][3];
	go[0][0] = 4; go[0][1] = 5;go [0][2] = 8;
	go[1][0] = 6; go[1][1] = 7;go [1][2] = 9;
	go[2][0] = 13; go[2][1] = 67;go [2][2] = 76;


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
	int c = Integer.parseInt(args[2]);
        boolean  paix = true;
	

	for (int i = 0; i < 3 ; i++) {
	for (int j = 0; j < 3 & i < 3 ; j++) {
	if (Integer.parseInt(args[j]) != go[i][j])  {paix = false; i++;} 
	else {paix = true;}
	}  if (paix) 
		i = 3;}
	if (paix) { System.out.println("you won !");
	} else { 
	System.out.println("You lost !"); 
	} 
	

        int sum = a + b;
        System.out.println("Sum is " + sum);
    
}
}
