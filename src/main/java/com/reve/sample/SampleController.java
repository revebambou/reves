package com.reve.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author reve
 *
 */
@Controller
@ConfigurationProperties(prefix = "person") // get the object person in application file
public class SampleController {

	// the value of person.name in application file will be set the Variable name
	// object's attribute should be same and setter and getter are required.
    @Setter
    @Getter
    private String name;
    // the value of person.addr in application file will be set the Variable addr
    @Setter
    @Getter
    private String addr;
	/**
     * logger
     */
    @Setter
    @Getter
	protected Logger logger = LoggerFactory.getLogger(getClass().getSimpleName());
    
    // get the name of value in application.yml or application.properties
    @Value("${name}")
    private String nameByValue;
    
    // get the person.addr of value in application.yml or application.properties
    @Value("${person.addr}")
    private String addrByValue;

	@RequestMapping("/sample")
	@ResponseBody // @ResponseBody is required, because of returning String words
	// if @ResponseBody is not added, error is occurred: There was an unexpected error (type=Not Found, status=404).
	public String sample() {
		return "reve";
	}

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		// get application info
		logger.info("name: " + nameByValue);
		logger.info("addr: " + addrByValue);
		logger.info("----------------------------");
		logger.info("name: " + name);
		logger.info("addr: " + addr);
		return null;
	}
}
