package com.sezerExam_02;

public class runner {

	public static void main(String[] args) {
		FlexArray ff = new FlexArray();

		ff.array = new int[3];

		ff.array[0] = 3;
		ff.array[1] = 6;
		ff.array[2] = 7;

		ff.list();

		ff.addComponant(8);
		ff.addComponant(11);
		ff.list();

		ff.addBtw(30, 3);
		ff.list();

		ff.deleteComponant(6);
		ff.list();

	}

}
