package com.maheshgo.demo.restcontrollers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.maheshgo.demo.rest.dao.SampleDao;
import com.maheshgo.demo.rest.model.SampleModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/rest")
public class HelloworldRestController {
    @Autowired
    private SampleDao sampleDao;

    @GetMapping(path="/sample", produces="application/json")
    public SampleModel test(){
        SampleModel model = new SampleModel("dsdf", "2454");
        SampleModel modelTest = sampleDao.getSample();
        System.out.println(modelTest.getId());
        return modelTest;
    }

    @PostMapping(path = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Object> postMethodName(@RequestParam("file") MultipartFile file) throws IOException {
        //TODO: process POST request
        try{
        File upload = new File("/home/maheshgo/download/"+file.getOriginalFilename());
        upload.createNewFile();
        FileOutputStream fout = new FileOutputStream(upload);
        fout.write(file.getBytes());
        fout.close();
        System.out.println("TRTRTRTRTRTRTR");
        }
        catch(IOException err){
            System.out.println(err);
        }
        return new ResponseEntity<>("File is uploaded successfully", HttpStatus.OK);
    }
    


}