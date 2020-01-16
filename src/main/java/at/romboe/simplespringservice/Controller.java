package at.romboe.simplespringservice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

	@RequestMapping("/lost")
	public String lost() {
		return "If we can't live together we're gonna die alone.";
	}

	@RequestMapping("/goethe")
	public String goethe() {
		return "Die Tat ist alles, nichts der Ruhm!";
	}

	@RequestMapping("/time")
	public String time() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime localTime = LocalTime.now();// ZoneId.of("GMT+02:00")
		return dtf.format(localTime);
	}
}