package com.thinkconstructive.restdemo.comtroller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorApiService {

    CloudVendor cloudVendor;// create this object so we could fill it post and get information using get request
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
}
