package HomeWork4;

//• 有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
public class HomeWork4_1_3 {
	public static void main(String[] args) {
		int vowelCnt = 0;
		String[] eightPlanets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < eightPlanets.length; i++) {
			for (int j = 0; j < eightPlanets[i].length(); j++) {
				if (eightPlanets[i].charAt(j) == 'a' || eightPlanets[i].charAt(j) == 'e'
						|| eightPlanets[i].charAt(j) == 'i' || eightPlanets[i].charAt(j) == 'o'
						|| eightPlanets[i].charAt(j) == 'u') {
					vowelCnt += 1;
				}
			}
		}
		System.out.print("有" + vowelCnt + "個母音");
	}
}
