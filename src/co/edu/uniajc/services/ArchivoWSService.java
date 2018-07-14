package co.edu.uniajc.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.edu.uniajc.control.ArchivoServiceImpl;
import co.edu.utilities.ResponseService;
import co.edu.utilities.Status;
import co.edu.utilities.Utilities;

@CrossOrigin
@RestController
public class ArchivoWSService {

	private static final Logger log = LoggerFactory.getLogger(ArchivoWSService.class);

	@Autowired
	private ArchivoServiceImpl service;

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public ResponseService uploadFile(@RequestParam("file") MultipartFile file) {
		ResponseService responseService = new ResponseService();
		try {
			responseService.setData(service.uploadFile(file));
			responseService.setStatus(Status.OK);
		} catch (Exception e) {
			responseService.setStatus(Status.FAILURE);
			responseService.setMessage(Utilities.ERRORUPLOAD);
			responseService.setCodeError(e.getMessage());
			log.error(Utilities.ERRORUPLOAD, e);
		}
		return responseService;
	}

}
