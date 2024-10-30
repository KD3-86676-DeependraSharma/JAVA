package com.sunbeam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Prrogram01 {
	
	public static void write(Set<Project> projectlist) {
		try(FileOutputStream fos=new FileOutputStream("Project.db")){
			try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
				oos.writeObject(projectlist);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static HashSet<Project> loadData() {
		try(FileInputStream fis=new FileInputStream("Project.db")){
			try(BufferedInputStream bis=new BufferedInputStream(fis)){
				try(ObjectInputStream ois=new ObjectInputStream(bis)){
					HashSet<Project>projectlist=(HashSet<Project>)ois.readObject();
					return projectlist;	
			}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static int menu(Scanner sc) {
		System.out.println("0. Exit");
		System.out.println("1. Add Following Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");
		System.out.println("3. Display all Projects in Set");
		System.out.println("4. Delete a Project by Id from Set");
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost");
		System.out.println("8. Find project with Max team size using Collections.max()");
		System.out.println("9. Count all Projects of \"Java\" technology using Stream API");
		
		System.out.println("Enter Choice :");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Set<Project>prjset= loadData();
        
//        if(prjset==null) {
//        	prjset=new HashSet<Project>();
//        }
        
        List<Project> prjlist=new ArrayList<Project>();
        
        
        Project prj;
        
        int choice;
        
        while((choice=menu(sc))!=0) {
        	switch(choice) {
        	case 1:{
        		prjset.add(new Project(1, "Train Reservation System",1, 5000000, "Java"));
        		prjset.add(new Project(2, "Airline Reservation System",3, 6000000, ".NET"));
        		prjset.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
        		prjset.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
        		prjset.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
        		prjset.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
        		System.out.println("All given product added.......");
        		break;
        	}
        	case 2:{
        		prj=new Project();
        		prj.accept(sc);
        		prjset.add(prj);
        		break;
        		
        	}
        	case 3:{
        		prjset.forEach(System.out::println);
        		break;
        	}
        	case 4:{
        		System.out.println("Enter Id for delete the project :");
        		int id1=sc.nextInt();
        		prj=new Project();
        		prj.id=id1;
        		System.out.println("Deleted project :"+prjset.remove(prj));
        		System.out.println("Delete a Project by Id from Set");
        		break;
        		
        	}
        	case 5:{
        		prjlist.addAll(prjset);
        		System.out.println("All set copied to Array List.......");
        		break;
        	}
        	case 6:{
        		prjlist.forEach(System.out::println);
        		break;
        	}
        	case 7:{
        		
        		Collections.sort(prjlist,(o1,o2)->Double.compare(o1.projectCost,o2.projectCost));
        		
        		System.out.println("project sorted by cost");
        		
        		prjlist.forEach(System.out::println);
        		break;
        		
        	}
        	case 8:{
                // Find project with max team size
                Project maxTeamProject = Collections.max(prjset, Comparator.comparingInt(proj -> proj.teamSize));
                System.out.println("Project with max team size: " + maxTeamProject);
                break;
        	}
        	case 9:{
                // Count Java projects using Stream API
                long javaProjectCount = prjset.stream().filter(proj -> "Java".equalsIgnoreCase(proj.technology)).count();
                System.out.println("Number of Java projects: " + javaProjectCount);
                break;
        		
        	}
        	}
        	 write(prjset);
        }  
	}

}
