package com.hamitmizrak.controller.mvc;

import com.hamitmizrak.business.dto.CustomerDto;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

//@controller
public interface ICustomerMvc {

    //Speed Data
    public String speedData();
    public String deleteAll();

    //CREATE
    public String customerCreateGet(Model model);
    public String customerCreatePost(CustomerDto customerDto, BindingResult bindingResult, Model model);

    //LIST
    public String customerListGet(Model model);

    //FIND
    public String customerFindGet(Long id, Model model);

    //DELETE
    public String customerDeleteGet(Long id, Model model);

    //UPDATE
    public String customerUpdateGet(Long id,Model model);
    public String customerUpdatePost(Long id,CustomerDto customerDto, BindingResult bindingResult, Model model);
}
