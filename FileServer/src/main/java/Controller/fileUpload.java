package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Descrip:
 * @Date :2023-06-13
 * @Time :17:13
 * @Author :Coder_Q
 */
@Controller
@RequestMapping("/picture")
public class fileUpload {
    @Autowired
    private ServletContext servletContext;
    @RequestMapping("/upload")
    public String pictureUpload(@RequestParam("picture") MultipartFile multipartFile) throws IOException {
        System.out.println("upload执行");
        String s = UUID.randomUUID().toString().replaceAll("-","");

        File file1 = new File(servletContext.getRealPath("/imgs"));
        file1.mkdir();
        File file = new File(file1,s+".png");
        System.out.println(file.getAbsolutePath());
        if(file.createNewFile()){
            multipartFile.transferTo(file);
        }
        return "redirect:http://localhost:8080/day15_SpringMVC_war_exploded/index";
    }
}
