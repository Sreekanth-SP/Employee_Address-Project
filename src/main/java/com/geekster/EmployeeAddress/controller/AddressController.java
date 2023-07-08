package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("addresses")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PostMapping("addresses")
    public String addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return "Address added";
    }
    @GetMapping("addresses/{id}/id")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
    @PutMapping("addresses/{id}/id")
    public String updateAddressById(@PathVariable Long id,@RequestBody Address addressDetails){
        return addressService.updateAddressById(id,addressDetails);
    }

    @DeleteMapping("addresses/{id}/id")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}



//GET /addresses - get all addresses
//GET /addresses/{id} - get an address by id
//POST /addresses - create a new address
//PUT /addresses/{id} - update an address by id
//DELETE /addresses/{id} - delete an address by id