package HomeWork4;
//• 班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數

public class HomeWork4_4 {
	public static void main(String[] args) {
		int oldScore = 0;
		int studentCode = 0;
		int studentData[][] = { 
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
				};
		
		int studentHighScoreCnt[] = new int[8];

		for (int i = 0; i < studentData.length; i++) {			//6
			for (int j = 0; j < studentData[i].length; j++) {	//8
				if (studentData[i][j] > oldScore) {
					studentCode = j;
					oldScore = studentData[i][j];
				}
			}
			studentHighScoreCnt[studentCode] += 1;
			oldScore = 0;
			studentCode = 0;
		}

		for (int i = 0; i < 8; i++) {
			System.out.println((i + 1) + "號同學最高分次數為:" + studentHighScoreCnt[i]);
		}
	}
}
