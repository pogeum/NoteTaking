package com.webProject.webProject.Store;

import com.webProject.webProject.Menu.Menu;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
public class StoreForm {

    private String name;

    private String content; //설명 없을시 설명이 없습니다. 라고 뜨도록?

    private String category;

    private String postcode;

    private String roadAddress;

    private String jibunAddress;

    private List<Menu> menuList;

    private List<MultipartFile> fileList; //    사장이 등록할 사진

}
