public class main
{
	public static moves movelist;
	public static int i; 
	
	public static int board[] = new int[16];
	public static int moved[] = new int[16];
	
	public static void printmoves()
	{
		
	}
	public static void printboard()
	{
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");
	}
	
	public static void printtboard(int[] tboard)
	{
		System.out.println("    " + tboard[0]);
		System.out.println("   " + tboard[1] + " " + tboard[2]);
		System.out.println("  " + tboard[3] + " " + tboard[4] + " " + tboard[5]);
		System.out.println(" " + tboard[6] + " " + tboard[7] + " " + tboard[8] + " " + tboard[9]);
		System.out.println(tboard[10] + " " + tboard[11] + " " + tboard[12] + " " + tboard[13] + " " + tboard[14]);
		System.out.println("");
	}
	
	public static int trymove(int pegsout,move nmove, int[] nboard,int cmove)
	{
		int[] tboard = nboard.clone();
		int[] vmoves = new int[36];
		int tried = 0;
		tboard[nmove.to] = 1;
		tboard[nmove.over] = 0;
		tboard[nmove.from] = 0;
		pegsout = pegsout + 1;
		System.out.println("Move:  " + cmove + "\tOut: " + pegsout);
//		printtboard(nboard);
		printtboard(tboard);
		for(i = 0; i < 36 ; i ++)
		{
			vmoves[i] = 0;
		}
		if(pegsout == 14)
		{
			return 1;
		}
		
		for(i = 0 ; i < 36 ; i ++)
		{
			//Check if a move is valid
			if(tboard[movelist.movelist[i].to] == 0 && tboard[movelist.movelist[i].over] == 1 && tboard[movelist.movelist[i].from] == 1)
			{
				vmoves[i] = 1;
			}
		}
		
		//Try all valid moves
		for( i = 0; i < 36 ; i++)
		{
		if(vmoves[i] == 1)
		{
			tried = trymove(pegsout,movelist.movelist[i],tboard,i);
			
			if(tried == 1)
			{
				moved[pegsout] = i;
				return 1;
			}
		}
		tried = 0;
		}

		return 0;
	}
	
	public static void main(String[] args)
	{
		movelist = new moves();
		for(i = 1 ; i < 15 ; i++)
		{
			board[i] = 1;
			moved[i] = -1;
		}
		printboard();
		board[0] = 0;
		moved[0] = 0;
		trymove(1,movelist.movelist[0],board,0);

	}
}

class move
{
	int from;
	int over;
	int to;
	
	public move(int nto, int nover, int nfrom)
	{
		this.from = nfrom;
		this.over = nover;
		this.to = nto;
	}
}

class moves
{
	public move movelist[] = new move[36];
	
	
	public moves()
	{
	 movelist[0] = new move(0,1,3);
	 movelist[1] = new move(0,2,5);
	 movelist[2] = new move(1,3,6);
	 movelist[3] = new move(1,4,8);
	 movelist[4] = new move(2,4,7);
	 movelist[5] = new move(2,5,9);
	 movelist[6] = new move(3,1,0);
	 movelist[7] = new move(3,7,12);
	 movelist[8] = new move(3,6,10);
	 movelist[9] = new move(4,7,11);
	 movelist[10] = new move(4,8,13);
	 movelist[11] = new move(5,2,0);
	 movelist[12] = new move(5,8,12);
	 movelist[13] = new move(5,9,14);
	 movelist[14] = new move(6,3,1);
	 movelist[15] = new move(6,7,8);
	 movelist[16] = new move(7,4,2);
	 movelist[17] = new move(7,8,9);
	 movelist[18] = new move(8,4,1);
	 movelist[19] = new move(8,7,6);
	 movelist[20] = new move(9,5,2);
	 movelist[21] = new move(9,8,7);
	 movelist[22] = new move(10,11,12);
	 movelist[23] = new move(10,6,3);
	 movelist[24] = new move(11,7,4);
	 movelist[25] = new move(11,12,13);
	 movelist[26] = new move(12,7,3);
	 movelist[27] = new move(12,11,10);
	 movelist[28] = new move(12,13,14);
	 movelist[29] = new move(12,8,5);
	 movelist[30] = new move(13,8,4);
	 movelist[31] = new move(3,4,5);
	 movelist[32] = new move(5,4,3);
	 movelist[33] = new move(13,12,11);
	 movelist[34] = new move(14,9,5);
	 movelist[35] = new move(14,13,12);

	
	}

}
