package homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý 1","C# + Angular","Engin Demirog");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý 2","JAVA + React","Engin Demirog");
		Course course3 = new Course(3,"Programlamaya Giriþ için Temel Kurs","PYHTON,JAVA,C#","Engin Demirog");
		
		
		Course[] courses= {course1,course2,course3};
		
		System.out.println(courses.length);
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.id =1;
		category1.name="Tümü";
		
		Category category2 = new Category();
		category2.id =2;
		category2.name="Proglamlama";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCart(course2);
		
		
		
		
		

	}

}
