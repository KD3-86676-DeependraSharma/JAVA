package com.sunbeam;

import java.io.Serializable;
import java.util.Scanner;

public class Project implements Serializable {

	int id;
	String title;
	int teamSize;
	double projectCost;
	String technology;
	
	public Project() {
		super();
	}

	public Project(int id, String title, int teamSize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.projectCost = projectCost;
		this.technology = technology;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter projrct id :");
		id=sc.nextInt();
		System.out.println("Enter project title :");
		title=sc.next();
		System.out.println("Enter project teamsize :");
		teamSize=sc.nextInt();
		System.out.println("Enter ProjectCost :");
		projectCost=sc.nextDouble();
		System.out.println("Enter Technology :");
		technology=sc.next();
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]\n";
	}
	
	
}
