package systool.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sys")
public class IndexController {
	@RequestMapping(method=RequestMethod.GET) 
	public String home(Map<String,Object> model){
		System.out.println("hello spring boot");
		return "home";
	}
	@RequestMapping("/shutdown")
	public void ShutDown() {
		Runtime rt = Runtime.getRuntime();
		try{
		rt.exec("shutdown.exe -s -t 20");
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
