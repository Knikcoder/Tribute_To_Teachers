import java.util.*;
class TeachersDay 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello Dude ..! Its Sept 5 Do u remember anything");
		System.out.println("Ok Then..! Give me the best 5 teachers that had changed your path");
		ArrayList <String> Teachers= new ArrayList<>();
		ArrayList<String> qualities = new ArrayList<String>();
        qualities.add("Passion and Enthusiasm");
        qualities.add("Approachability");
        qualities.add("Effective Communication");
        qualities.add("Empathy and Understanding");
        qualities.add("Fairness and Consistency");
		String[] teacherDescriptions = {
            "Your unwavering dedication to your students is truly inspiring. Thank you for always going the extra mile to ensure our success.",
            "Your patience knows no bounds, and it's made all the difference in our learning journey. You're a true guiding light.",
            "Your words of encouragement have given us the confidence to chase our dreams. Your belief in us means the world.",
            "You've created a safe and supportive space for us to learn and grow. Your caring nature has made our educational experience unforgettable.",
            "Your passion for teaching is contagious, and your enthusiasm has ignited a lifelong love for learning within us. Thank you for being our source of inspiration"
        };
		System.out.println("_______________________________________________________________");
		for (int i=0;i<5 ;i++ )
		{
			System.out.print("(" +(i+1)+ ")" + " Teacher with " + qualities.get(i) + " : ");
			String a =sc.nextLine();
			Teachers.add(a);
		}
		System.out.println("Title: \"Celebrating Our Top 5 Teachers\"");
            System.out.println("\nIn life, we encounter countless individuals who leave a lasting impression on us. Among them, teachers hold a special place. They are the guiding stars who illuminate our path to knowledge, wisdom, and personal growth.");


        for (int i = 0; i < Teachers.size(); i++) {
            String teacherName = Teachers.get(i);
            String teacherDescription = teacherDescriptions[i];
            System.out.println("\nToday, My wishes to " + teacherName + " whose "+qualities.get(i) + "inspired me the most: ");
            System.out.println(teacherDescription);
            System.out.println("\n");
        }
	}
}
