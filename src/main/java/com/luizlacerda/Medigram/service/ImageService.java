package com.luizlacerda.Medigram.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class ImageService {


    public void uploadImage(MultipartFile image) throws IOException {
        image.transferTo(new File("C:\\Users\\Dell\\Desktop\\L3\\Code\\Angular\\medigramapp\\src\\assets\\images\\"+image.getOriginalFilename()));
    }
}
