package aulaNatal;

import java.util.Scanner;

import org.apache.commons.math4.legacy.ml.distance.EuclideanDistance;

public class Abacate {
	public static void main(String[] args) {
		String x = "asd";
		Scanner sc;
		EuclideanDistance ed = new EuclideanDistance();
		double [] d = {1,3,5};
		double [] e = {2,2,2,2};
		System.out.println(ed.compute(d, e));
	}
}
