package com.company;

public class Main {

	public static void main(String[] args) {

		//inner class
		//local  inner class
		//רק כאשר מופעלת המתודה אז נוצרת המחלקה שהמתודה תסתיים ההגדרה של המחלקה תעלם
		//יצירת אוביקט מסוג מחלקה כלשהי עי סוגרים מסולסלות לא ניתן ליצור עוד אוביקט
		//אפשרות להגדרת אוביקט ממחלקה אבסטרקטית -זה לא יוצר אוביקט אלה יוצר מחלקה אנונמית היורשת מהמחלקה האבסטרקטית  עי זה שדורסת את הפונקציה
		//anonymous inner class
		int [] arr={10,4,8,7,1,2,3,5};
		minNumbers(arr,3);

		//static nested class
		//הדבר היחיד שזה נותן -ארגון וסדר
		Shape.Color myColor = new Shape.Color(34, 45, 100);
		Circle.Point point = new Circle().new Point(4, 5);
		Circle c = new Circle();
		Circle.Point point2 = c.new Point(87, 32);
		Student student = new Student();
		student.cityId = Student.KFAR_SAVA;
		student.gender = Gender.FEMALE;
		//השמה
		PrintType printType = PrintType.M2;
		System.out.println();

	}
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
		static int partition(int[] arr, int low, int high){
			int pivot = arr[high];
			int i = low - 1;
			for (int j = low; j < high; j++) {
				if(arr[j] <= pivot){
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			i++;
			int temp = arr[i];
			arr[i] = arr[high];
			arr[high] = temp;
			return i;
		}


	public static void minNumbers(int[] arr, int k) {
		int[] arr2=new int[k];
		for (int j = 0; j <k ; j++) {
				arr2[j]=arr[j];
		}
		quickSort(arr2, 0, arr.length-1);
		for (int i = k; i <arr.length ;) {
			for (int j = 0; j <k ; ) {

				if (arr[i] < arr2[j]) {
					arr2[j] = arr[i];

					i++;
					break;
				}
						else
							j++;
			}
		}
		for (int i = 0; i <arr2.length ; i++) {
			System.out.println(arr2[i]);

		}
	}
	}
