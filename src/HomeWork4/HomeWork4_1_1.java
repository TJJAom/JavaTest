package HomeWork4;

import java.util.Arrays;

//• 有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
public class HomeWork4_1_1 {
	public static void main(String[] args) {
		double arraysAvg = 0;
		int[] arrays = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < arrays.length; i++) {
			arraysAvg += arrays[i];
		}
		arraysAvg /= arrays.length;
		System.out.println("平均值為:" + arraysAvg);

		// 排序陣列
		Arrays.sort(arrays);
		System.out.println("大於平均值的元素為:");
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] > arraysAvg) {
				System.out.print(arrays[i] + "\t");
			}
		}
	}
}
