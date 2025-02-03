package in.myorg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(path = { "", "welcome", "home" })
	public String loadWelcomePage() {
		return "index";
	}
	

	@GetMapping("about")
	public String loadAboutPage() {
		return "about";
	}

	@GetMapping("booking")
	public String loadBookingPage() {
		return "booking";
	}

	@GetMapping("contact")
	public String loadContactPage() {
		return "contact";
	}

	@GetMapping("menu")
	public String loadMenuPage() {
		return "menu";
	}

	@GetMapping("service")
	public String loadServicePage() {
		return "service";
	}

	@GetMapping("team")
	public String loadTeamPage() {
		return "team";
	}

	@GetMapping("testimonial")
	public String loadTestimonialPage() {
		return "testimonial";
	}
}
