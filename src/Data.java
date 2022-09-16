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

	public Data(){
		
		scan = new Scanner(System.in);
		info = new JSONObject();

	}

	public String Date(){
		
		return LocalDate.now().toString();
	}

	public String Time(){

		return LocalTime.now().toString();

	}

	public void title(){
		
		System.out.print("Title: ");
		title = scan.nextLine();
	
	}

	public void mood(){

		System.out.print("Mood: ");
		mood = scan.next();
	}

	public void diary(){
		System.out.println("Your day: ");
		scan.useDelimiter("\\t");
		while(true){
			diary = scan.next();
			break;
		}
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
