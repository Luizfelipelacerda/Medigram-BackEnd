package com.luizlacerda.Medigram.resource;

import com.luizlacerda.Medigram.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/imagem")
public class ImagePostResource {
    @Autowired
    ImageService imageService;

    @PostMapping()
    public ResponseEntity<String> getImageByPostId(@RequestParam("image") MultipartFile image) throws IOException {
        imageService.uploadImage(image);
        return new ResponseEntity<>("tudo certo!", HttpStatus.OK);

    }
}
