public class main
{
	public static moves movelist;
	public static int i; 
	
	public static int board[] = new int[16];
	
	public static void main(String[] args)
	{
		movelist = new moves();
		//for(i = 0 ; i < 35 ; i++)
		//{
		//	System.out.println(movelist.movelist[i].beg + " " + movelist.movelist[i].mid + " " + movelist.movelist[i].end);
		//}
		
		for (i = 0 ; i < 16 ; i ++)
		{
			board[i] = 1;
		}
		board[0] = 0;
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");
		
		if(board[0] == 0 && board[1] == 1 && board[3] == 1)
		{
			board[0] = 1;
			board[1] = 0;
			board[3] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");
		
		if(board[3] == 0 && board[4] == 1 && board[5] == 1)
		{
			board[3] = 1;
			board[4] = 0;
			board[5] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");		
		
		if(board[5] == 0 && board[2] == 1 && board[0] == 1)
		{
			board[5] = 1;
			board[2] = 0;
			board[0] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[1] == 0 && board[3] == 1 && board[6] == 1)
		{
			board[1] = 1;
			board[3] = 0;
			board[6] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[3] == 0 && board[7] == 1 && board[12] == 1)
		{
			board[3] = 1;
			board[7] = 0;
			board[12] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		
		if(board[7] == 0 && board[8] == 1 && board[9] == 1)
		{
			board[7] = 1;
			board[8] = 0;
			board[9] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		
		if(board[6] == 0 && board[3] == 1 && board[1] == 1)
		{
			board[6] = 1;
			board[3] = 0;
			board[1] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[8] == 0 && board[7] == 1 && board[6] == 1)
		{
			board[8] = 1;
			board[7] = 0;
			board[6] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[12] == 0 && board[13] == 1 && board[14] == 1)
		{
			board[12] = 1;
			board[13] = 0;
			board[14] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[13] == 0 && board[12] == 1 && board[11] == 1)
		{
			board[13] = 1;
			board[12] = 0;
			board[11] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[12] == 0 && board[8] == 1 && board[5] == 1)
		{
			board[12] = 1;
			board[5] = 0;
			board[8] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[11] == 0 && board[12] == 1 && board[13] == 1)
		{
			board[11] = 1;
			board[12] = 0;
			board[13] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
		
		if(board[12] == 0 && board[11] == 1 && board[10] == 1)
		{
			board[12] = 1;
			board[11] = 0;
			board[10] = 0;
		}
		System.out.println("    " + board[0]);
		System.out.println("   " + board[1] + " " + board[2]);
		System.out.println("  " + board[3] + " " + board[4] + " " + board[5]);
		System.out.println(" " + board[6] + " " + board[7] + " " + board[8] + " " + board[9]);
		System.out.println(board[10] + " " + board[11] + " " + board[12] + " " + board[13] + " " + board[14]);
		System.out.println("");	
	}
}

class move
{
	int beg;
	int mid;
	int end;
	
	public move(int newbeg, int newmid, int newend)
	{
		this.beg = newbeg;
		this.mid = newmid;
		this.end = newend;
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