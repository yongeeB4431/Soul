import java.io.File;
import java.io.PrintWriter;
import org.json.JSONObject;
import org.json.JSONException;

public class Files {

	private File folder;
	private File file;
	private JSONObject data;

	public Files(){

		data = new JSONObject();

	}

	void createFolder(){
		
		folder = new File("Memories");
		if(!folder.exists())
			folder.mkdirs();
		return;

	}

	void createFile(){
		this.createFolder();
		Data info = new Data();
		data = info.getData();
		String title = "Memories/" + data.get("title");
		title += ".json";
		file = new File(title);
		try {
			file = new File(title);
			if(file.createNewFile())
				System.out.println(title + " created");
			else
				System.out.println(title + " exists");
		} catch (Exception e){
			System.err.println(e);
		}
		try(PrintWriter pw = new PrintWriter(file)) {
			pw.write(data.toString());
		}
		catch(Exception e) {
				
			e.printStackTrace();
		}

	}

	public void Execute(){
		
		this.createFile();

	}
}
