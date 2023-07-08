package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> getAllAddress() {
        return (List<Address>) iAddressRepo.findAll();
    }

    public void addAddress(Address address) {
        iAddressRepo.save(address);
    }


    public Optional<Address> getAddressById(Long id) {
        return iAddressRepo.findById(id);
    }

    public String updateAddressById(Long id,Address addressDetails) {
        List<Address> addressList =  getAllAddress();
        for(Address address :addressList){
            if(address.getAddressId()==id){
                address.setStreetName(addressDetails.getStreetName());
                address.setCityName(addressDetails.getCityName());
                address.setStateName(addressDetails.getStateName());
                address.setZipcode(addressDetails.getZipcode());
                iAddressRepo.save(address);
                return "Address Updated ";
            }
        }
        return "Id not found"+id;

    }

    public String deleteAddressById(Long id) {
        iAddressRepo.deleteById(id);
        return "Address Deleted";
    }
}
