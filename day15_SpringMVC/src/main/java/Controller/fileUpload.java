package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Descrip:
 * @Date :2023-06-13
 * @Time :16:07
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/User")
public class fileUpload {
    @PostMapping("/Register")
    @ResponseBody
    public String pictureUpload(String username, @RequestParam(value = "picture") MultipartFile multipartFile) throws IOException {
        //获取表单文件上传到哦key值
        String name = multipartFile.getName();
        System.out.println("name = " + name);

        //获取文件名
        String originalFilename = multipartFile.getOriginalFilename();
        System.out.println("originalFilename = " + originalFilename);

        //获取文件大小
        long size = multipartFile.getSize();
        System.out.println("size = " + size);

        //获取文件字节流
        byte[] bytes = multipartFile.getBytes();
        System.out.println("bytes = " + bytes);
        File file = new File("C:\\Users\\DELL\\Desktop\\SSM\\day15_SpringMVC\\src\\main\\webapp\\imgs\\test1.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(bytes,0,bytes.length);
        fileOutputStream.close();


        //获取文件输入流
        InputStream inputStream = multipartFile.getInputStream();
        System.out.println("inputStream = " + inputStream);
        FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\DELL\\Desktop\\SSM\\day15_SpringMVC\\src\\main\\webapp\\imgs\\test2.png");
        int length = 0;
        byte[] buffer = new byte[1024];
        while((length = inputStream.read(buffer)) != -1){
            fileOutputStream1.write(buffer,0,length);
        }
        inputStream.close();
        fileOutputStream1.close();




        //获取文件类型
        String contentType = multipartFile.getContentType();
        System.out.println("contentType = " + contentType);

        return "index";
    }
}
