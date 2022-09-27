package controller;

/*
 ** @author LiGuanda
 ** @date  PM 2:09:45
 ** @description This is a description of Day7Controller
 ** @params
 ** @return
 ** @since version-1.0  */


import dao.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Lenovo
 */
@Controller
public class Day7Controller {


    @GetMapping("/heiheihei")
    @ResponseBody
    public Employee heiheihei() {

        return new Employee("JuJingyi", "123456", 520);

    }


    @PostMapping("/hehehe")
    @ResponseBody
    public String hehehe(String username, String password) {

        System.out.println("username = " + username + " password = " + password);
        return "JuJingyi loves Dage!!!";

    }


    @RequestMapping("/hahaha")
    public ResponseEntity<byte[]> hahaha(HttpSession session) throws IOException {

        ServletContext context = session.getServletContext();
        String realPath = context.getRealPath("/static/img/JuJingyi.jpg");
        byte[] buffer;
        MultiValueMap<String, String> map = new HttpHeaders();
        HttpStatus status;
        try (FileInputStream fis = new FileInputStream(realPath)) {

            buffer = new byte[fis.available()];
            //noinspection ResultOfMethodCallIgnored
            fis.read(buffer);
            map.add("Content-Disposition", "attachment;filename=JJY.jpg");
            status = HttpStatus.OK;

        }

        return new ResponseEntity<>(buffer, map, status);

    }


    @PostMapping("/xixixi")
    public String xixixi(MultipartFile profile, HttpSession session) throws IOException {

        String originFilename = profile.getOriginalFilename();
        String suffix = originFilename.substring(originFilename.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        originFilename = uuid.replace("-", "") + suffix;
        ServletContext context = session.getServletContext();
        String path = context.getRealPath("photo");
        File file = new File(path);
        if (!file.exists()) {

            file.mkdir();

        }
        String wholePath = path + File.separator + originFilename;
        File file1 = new File(wholePath);
        profile.transferTo(file1);
        return "success";

    }


}
