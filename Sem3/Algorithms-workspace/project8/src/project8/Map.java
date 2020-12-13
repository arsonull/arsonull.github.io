package project8;

public class Map
{
	private int[][] map = new int[15][15];
	private int total = 0;
	
	public Map()
	{
		map[0][1] = 14;
		map[0][11] = 14;
		map[0][12] = 9;
		map[1][0] = 14;
		map[1][2] = 9;
		map[1][10] = 17;
		map[1][11] = 9;
		map[2][1] = 9;
		map[2][3] = 5;
		map[2][9] = 20;
		map[2][10] = 13;
		map[3][2] = 5;
		map[3][4] = 17;
		map[3][9] = 19;
		map[4][3] = 17;
		map[4][5] = 16;
		map[4][9] = 4;
		map[5][4] = 16;
		map[5][6] = 8;
		map[5][7] = 9;
		map[5][9] = 12;
		map[6][5] = 8;
		map[6][7] = 6;
		map[7][5] = 9;
		map[7][6] = 6;
		map[7][8] = 7;
		map[7][9] = 12;
		map[7][13] = 23;
		map[7][14] = 10;
		map[8][7] = 7;
		map[8][9] = 13;
		map[8][10] = 5;
		map[8][14] = 6;
		map[9][2] = 20;
		map[9][3] = 19;
		map[9][4] = 4;
		map[9][5] = 12;
		map[9][7] = 12;
		map[9][8] = 13;
		map[9][10] = 7;
		map[10][1] = 17;
		map[10][2] = 13;
		map[10][8] = 5;
		map[10][9] = 7;
		map[10][11] = 18;
		map[10][14] = 8;
		map[11][0] = 14;
		map[11][1] = 9;
		map[11][10] = 18;
		map[11][12] = 15;
		map[11][14] = 9;
		map[12][0] = 9;
		map[12][11] = 15;
		map[12][13] = 11;
		map[12][14] = 15;
		map[13][7] = 23;
		map[13][12] = 11;
		map[13][14] = 18;
		map[14][7] = 10;
		map[14][8] = 6;
		map[14][10] = 8;
		map[14][11] = 9;
		map[14][12] = 15;
		map[14][13] = 18;
	}
	
	public int myGetDistance(int start, int end)
	{
		int m = end;
		int total = 0;
		if (map[start][end] > 0)
		{
			return map[start][end];
		}
		while (map[start][m] == 0)
		{
			if (m == 15) m = -1;
			m += 1;
			while (map[start][m] == 0) m += 1;
			total += map[start][m];
			//System.out.println(start + " " + m + ": " + map[start][m] + " and total " + total);
			start = m;
			m = end;
			if (map[start][m] > 0)
			{
				total += map[start][end];
				return total;
			}
		}
		
		return 0;
	}
	
	public void display()
	{
		for (int i = 0; i < 15; i++)
		{
			for (int j = 0; j < 15; j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void getNeighbor(int i)
	{
		for (int j = 0; j < 15; j++)
		{
			if (map[i][j] != 0) System.out.print(j + " ");
		}
		System.out.println();
	}
}
