package Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;

/**
 * @Descrip:
 * @Date :2023-06-15
 * @Time :16:59
 * @Author :Coder_Q
 */
@Controller
@RequestMapping(value = "/fileDownload")
public class FileDownload {
    @RequestMapping("/test1")
    public void test1(HttpServletResponse resp)throws Exception{
        //1.获取文件输入流
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\SSM\\day15_SpringMVC\\src\\main\\webapp\\imgs\\数据校验.png");
        byte[] bytes = new byte[8 * 1024];
        int length = -1;
        //2.设置下载响应头
        //浏览器默认只浏览文件，需要指定下载头下载文件
        resp.setHeader("content-disposition","attachment;filename=demo.png");


        //3.往请求体中写入数据
        ServletOutputStream outputStream = resp.getOutputStream();
        while((length = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes);
        }
        outputStream.close();
        fileInputStream.close();
    }


    @RequestMapping(value = "/test2")
    public ResponseEntity<byte[]> test2() throws Exception{
        //1.获取文件输入流
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\DELL\\Desktop\\SSM\\day15_SpringMVC\\src\\main\\webapp\\imgs\\数据校验.png");
        int length = fileInputStream.available();
        byte[] bytes = new byte[length];
        fileInputStream.read(bytes);
        //2.设置下载响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("content-disposition","attachment;filename=demo.png");
        //3.封装ResponseEntity
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
        return responseEntity;
    }


    @RequestMapping(value = "/test3")
    public ResponseEntity<String> test3() throws Exception{
        //1.获取文件输入流

        //2.设置下载响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        //3.封装ResponseEntity
        ResponseEntity<String> responseEntity = new ResponseEntity<>("error", httpHeaders, HttpStatus.NOT_FOUND);
        return responseEntity;
    }
}
