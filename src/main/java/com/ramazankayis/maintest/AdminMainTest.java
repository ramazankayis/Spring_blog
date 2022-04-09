package com.ramazankayis.maintest;

import com.ramazankayis.controller.AdminController;
import com.ramazankayis.dto.AdminDto;

public class AdminMainTest {
    public static void main(String[] args) {

        AdminController adminController = new AdminController();
        //Create
       /* AdminDto adminDto = AdminDto
                            .builder()
                            .name("Ramazan & Esra")
                            .surname("333333").build();
        adminController.create(adminDto);*/

        //update
      /* AdminDto adminDto = AdminDto.builder().id(2).name("esra 28 ").surname("kayış 19").build();


        adminController.update(adminDto);*/

        //Delete
        /*AdminDto adminDto = AdminDto.builder().id(2).build();
        adminController.delete(adminDto);*/

        //List
        adminController.list().forEach(System.out::println);

    }
}
