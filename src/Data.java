import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONException;

public class Data{

	private String date;
	private String time;
	private String title;
	private boolean starred;
	private String mood;
	private String diary;
	private Scanner scan;
	private JSONObject info;
	private Colors white,green,yellow,reset,yellow_underlined;

	public Data(){
		
		scan = new Scanner(System.in);
		info = new JSONObject();
		white = Colors.WHITE;
		green = Colors.GREEN;
		yellow = Colors.YELLOW;
		reset = Colors.RESET;
		yellow_underlined= Colors.YELLOW_UNDERLINED;


	}

	public String Date(){
		
		return LocalDate.now().toString();
	}

	public String Time(){

		return LocalTime.now().toString();
	}

	public void title(){
		
		System.out.print(yellow.get() + "Title: " + white.get());
		title = scan.nextLine();
	
	}

	public void mood(){

		System.out.print(green.get() + "Mood: " + white.get());
		mood = scan.next();
	}

	public void diary(){
		System.out.println(yellow_underlined.get() + "Your day: " +  yellow.get());
		scan.useDelimiter("\\t");
		while(true){
			diary = scan.next();
			break;
		}
		System.out.print(reset.get());
	}

	public void executeData(){

		date = this.Date();
		time = this.Time();
		this.title();
		this.mood();
		this.diary();
	}

	public JSONObject getData(){
		
		this.executeData();
		try {
			info.put("date", this.date);
			info.put("time", this.time);
			info.put("title", this.title);
			info.put("mood", this.mood);
			info.put("diary", this.diary);

		} catch(JSONException e) {

			e.printStackTrace();
		}

		return info;
	}
}
